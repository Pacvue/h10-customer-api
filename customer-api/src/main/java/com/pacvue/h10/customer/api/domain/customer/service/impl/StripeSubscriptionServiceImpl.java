package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import com.pacvue.h10.customer.api.domain.customer.service.StripeSubscriptionService;
import com.pacvue.h10.customer.api.infrastructure.config.UserContext;
import com.pacvue.h10.customer.api.infrastructure.helper.PlansHelper;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

public class StripeSubscriptionServiceImpl implements StripeSubscriptionService {

    @Resource
    private PlansHelper plansHelper;

    public String getSubscriptionPlan(Boolean base, Boolean forceHeliumPlanId) {
        StripeSubscription stripeSubscription = UserContext.getUser().getStripeSubscription();
        if (ObjectUtils.isEmpty(stripeSubscription) || ObjectUtils.isEmpty(stripeSubscription.getHeliumPlanId())) {
            return PlansHelper.HELIUM10_FREE_PLAN;
        }
        if (!forceHeliumPlanId && PlansHelper.HELIUM10_ENTERPRISE_PRODUCT.equals(stripeSubscription.getStripeProductId())) {
            return base ? plansHelper.getBasePlanForEnterprisePlan(stripeSubscription.getHeliumPlanId())
                    : PlansHelper.HELIUM10_ENTERPRISE_PRODUCT;
        }

        return stripeSubscription.getHeliumPlanId();
    }
}
