package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.mybatisflex.core.query.QueryWrapper;
import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import com.pacvue.h10.customer.api.domain.customer.mapper.StripeSubscriptionMapper;
import com.pacvue.h10.customer.api.domain.customer.service.AccountService;
import com.pacvue.h10.customer.api.infrastructure.constant.PlansHelper;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

import static com.pacvue.h10.customer.api.domain.customer.entity.table.StripeSubscriptionTableDef.STRIPE_SUBSCRIPTION;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private StripeSubscriptionMapper stripeSubscriptionMapper;
    @Override
    public String getSubscriptionPlan(Boolean base, Boolean forceHeliumPlanId) {
        return "";
    }

    @Override
    public Boolean getIsSubscriber(Long accountId, String moduleId)
    {
        QueryWrapper wrapper = QueryWrapper.create().select().where(STRIPE_SUBSCRIPTION.ACCOUNT_ID.eq(accountId));
        StripeSubscription stripeSubscription = stripeSubscriptionMapper.selectOneByQuery(wrapper);

        if (ObjectUtils.isEmpty(stripeSubscription)) {
            StripeSubscription.builder().
                    accountId(accountId).
                    subscriptionId("free_" + accountId).
                    accountId(accountId).
                    planId(PlansHelper.HELIUM10_FREE_PLAN).
                    heliumPlanId(PlansHelper.HELIUM10_FREE_PLAN).
                    createdAt((int) Instant.now().getEpochSecond()).
                    updatedAt((int) Instant.now().getEpochSecond()).
                    isActive(true).build();

                    // "billingPeriodEndAt" => DateHelper::getTimeByMonthInterval(1),
            stripeSubscriptionMapper.insert(stripeSubscription);
            return false;
        }


//        return self::hasPaidSubscription($subscription, $moduleId);
        return true;
    }
}
