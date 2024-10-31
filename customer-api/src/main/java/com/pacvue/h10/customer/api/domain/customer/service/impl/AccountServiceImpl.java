package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import com.pacvue.h10.customer.api.domain.customer.mapper.StripeSubscriptionMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.User2AccountMapper;
import com.pacvue.h10.customer.api.domain.customer.service.AccountService;
import com.pacvue.h10.customer.api.domain.customer.service.StripeSubscriptionService;
import com.pacvue.h10.customer.api.infrastructure.constant.ParamsConfig;
import com.pacvue.h10.customer.api.infrastructure.config.UserContext;
import com.pacvue.h10.customer.api.infrastructure.helper.*;
import com.pacvue.h10.customer.dto.response.AccountDto;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private StripeSubscriptionMapper stripeSubscriptionMapper;
    @Resource
    private User2AccountMapper user2AccountMapper;
    @Resource
    private StripeSubscriptionService stripeSubscriptionService;

    @Override
    public List<AccountDto> getAccounts(Integer userId) {
        return user2AccountMapper.getAccountsByUserId(userId);
    }

    @Override
    public String getSubscriptionPlan(Boolean base, Boolean forceHeliumPlanId, Integer id) {
        if (getIsSubscriber(id, null)) {
            return PlansHelper.HELIUM10_FREE_PLAN;
        }
        return stripeSubscriptionService.getSubscriptionPlan(base, forceHeliumPlanId);
    }

    @Override
    public Boolean getIsSubscriber(Integer accountId, String moduleId) {
        StripeSubscription stripeSubscription = UserContext.getUser().getStripeSubscription();

        if (ObjectUtils.isEmpty(stripeSubscription)) {
            stripeSubscription = StripeSubscription.builder().
                    accountId(accountId).
                    subscriptionId("free_" + accountId).
                    accountId(accountId).
                    planId(PlansHelper.HELIUM10_FREE_PLAN).
                    heliumPlanId(PlansHelper.HELIUM10_FREE_PLAN).
                    createdAt((int) Instant.now().getEpochSecond()).
                    updatedAt((int) Instant.now().getEpochSecond()).
                    isActive(true).
                    billingPeriodEndAt((int) DateHelper.getTimeByMonthInterval(1, Instant.now()).getEpochSecond())
                    .build();
            stripeSubscriptionMapper.insert(stripeSubscription);
            UserContext.getUser().setStripeSubscription(stripeSubscription);
            return false;
        }
        return hasPaidSubscription(stripeSubscription, moduleId);
    }

    public Boolean hasPaidSubscription(StripeSubscription stripeSubscription, String moduleId) {
        boolean oldPlan = "Helium10_Bronze".equals(stripeSubscription.getPlanId()) || "Helium10_Silver".equals(stripeSubscription.getPlanId());
        boolean freePlan = PlansHelper.HELIUM10_FREE_PLAN.equals(stripeSubscription.getPlanId());
        boolean aLaCarteAvailable = true;
        ObjectMapper objectMapper = new ObjectMapper();
        if (ObjectUtils.isNotEmpty(moduleId) &&
                PlansHelper.HELIUM10_A_LA_CARTE_PLANS.contains(stripeSubscriptionService.getSubscriptionPlan(false, true))) {
            aLaCarteAvailable = false;
            List<String> plans = ObjectUtils.isEmpty(stripeSubscription.getPlansList()) ? new ArrayList<>() :
                    objectMapper.convertValue(stripeSubscription.getPlansList(), List.class);
            Map<String, Object> toolOptions = ParamsConfig.tools.getOrDefault(moduleId, new HashMap<>());

            if (!toolOptions.isEmpty() && ObjectUtils.isNotEmpty(toolOptions.get("aLaCartePlanId"))) {
                String aLaCartePlan = PlansMapHelper.getStripePlanId((String) toolOptions.get("aLaCartePlanId"));
                String legacyALaCartePlan = PlansMapHelper.getStripePlanId((String) toolOptions.get("legacyALaCartePlanId"));
                String aLaCarteAnnualPlan = PlansMapHelper.getStripePlanId((String) toolOptions.get("aLaCarteAnnualPlanId"));
                String legacyALaCarteAnnualPlan = PlansMapHelper.getStripePlanId((String) toolOptions.get("legacyALaCarteAnnualPlanId"));

                if (plans.contains(aLaCartePlan) || plans.contains(legacyALaCartePlan) ||
                        plans.contains(aLaCarteAnnualPlan) || plans.contains(legacyALaCarteAnnualPlan)) {
                    aLaCarteAvailable = true;
                }
            }
        }
        Boolean isActive = stripeSubscription.getIsActive() &&
                !StripeHelper.isInactiveSubscription(stripeSubscription.getStripeProductId(), stripeSubscription.getStatus());
        Boolean isValidDate = EnvHelper.isLocalEnv() || Instant.ofEpochSecond(stripeSubscription.getBillingPeriodEndAt()).isAfter(Instant.now().minus(48, ChronoUnit.HOURS));
        Boolean isValidPlan = !oldPlan && !freePlan && aLaCarteAvailable;
        return isActive && isValidDate && isValidPlan;
    }

    @Override
    public Boolean hasToolAccess(String tool) {
        return null;
    }

    @Override
    public Boolean isToolIncludedInCurrentPlan(String tool) {
        return null;
    }
}
