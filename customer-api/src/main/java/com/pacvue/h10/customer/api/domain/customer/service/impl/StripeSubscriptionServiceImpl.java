package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.pacvue.h10.customer.api.domain.customer.service.StripeSubscriptionService;
import com.pacvue.h10.customer.api.infrastructure.helper.PlansHelper;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

public class StripeSubscriptionServiceImpl implements StripeSubscriptionService {

    @Resource
    private PlansHelper plansHelper;

    public String getSubscriptionPlan(Boolean base, Boolean forceHeliumPlanId, String stripeProductId, String heliumPlanId) {
        if (!forceHeliumPlanId && PlansHelper.HELIUM10_ENTERPRISE_PRODUCT.equals(stripeProductId)) {
            return base ? plansHelper.getBasePlanForEnterprisePlan(heliumPlanId)
                    : PlansHelper.HELIUM10_ENTERPRISE_PRODUCT;
        }
        if (ObjectUtils.isEmpty(heliumPlanId)) {
            return PlansHelper.HELIUM10_FREE_PLAN;
        }
        return heliumPlanId;
    }
}
