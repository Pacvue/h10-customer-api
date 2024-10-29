package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.mybatisflex.core.query.QueryWrapper;
import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import com.pacvue.h10.customer.api.domain.customer.mapper.StripeSubscriptionMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.User2AccountMapper;
import com.pacvue.h10.customer.api.domain.customer.service.AccountService;
import com.pacvue.h10.customer.api.domain.customer.service.StripeSubscriptionService;
import com.pacvue.h10.customer.api.infrastructure.helper.PlansHelper;
import com.pacvue.h10.customer.api.infrastructure.helper.DateHelper;
import com.pacvue.h10.customer.dto.response.AccountDto;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

import static com.pacvue.h10.customer.api.domain.customer.entity.table.StripeSubscriptionTableDef.STRIPE_SUBSCRIPTION;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private StripeSubscriptionMapper stripeSubscriptionMapper;
    @Resource
    private User2AccountMapper user2AccountMapper;
    @Resource
    private StripeSubscriptionService stripeSubscriptionService;

    @Override
    public List<AccountDto> getAccounts(Long userId) {
        return user2AccountMapper.getAccountsByUserId(userId);
    }

    @Override
    public String getSubscriptionPlan(Boolean base, Boolean forceHeliumPlanId, Long id) {
        if (getIsSubscriber(id, null)) {
            return PlansHelper.HELIUM10_FREE_PLAN;
        }
        return stripeSubscriptionService.getSubscriptionPlan(base, forceHeliumPlanId, null, null);
    }

    @Override
    public Boolean getIsSubscriber(Long accountId, String moduleId) {
        QueryWrapper wrapper = QueryWrapper.create().select().where(STRIPE_SUBSCRIPTION.ACCOUNT_ID.eq(accountId));
        StripeSubscription stripeSubscription = stripeSubscriptionMapper.selectOneByQuery(wrapper);

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
            return false;
        }

        return hasPaidSubscription(stripeSubscription.getPlanId(), stripeSubscription.getPlansList(), moduleId);
    }

    public Boolean hasPaidSubscription(String planId, String plansList, String moduleId) {
        return true;
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
