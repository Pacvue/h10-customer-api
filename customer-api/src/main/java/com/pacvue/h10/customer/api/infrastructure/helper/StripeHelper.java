package com.pacvue.h10.customer.api.infrastructure.helper;

import com.pacvue.h10.customer.api.infrastructure.enums.SubscriptionStatusEnum;

import java.util.Arrays;
import java.util.List;

public class StripeHelper {

    /**
     * @param stripeProductId stripeProductId
     */
    public static List<String> getActiveStatuses(String stripeProductId) {
        List<String> activeStatuses = Arrays.asList(
                SubscriptionStatusEnum.STATUS_ACTIVE.getStatus(),
                SubscriptionStatusEnum.STATUS_TRIALING.getStatus());
        if (PlansHelper.HELIUM10_ENTERPRISE_PRODUCT.equals(stripeProductId)) {
            activeStatuses.add(SubscriptionStatusEnum.STATUS_PAST_DUE.getStatus());
        }
        return activeStatuses;
    }

    public static Boolean isInactiveSubscription(String stripeProductId, String subscriptionStatus) {
        return getActiveStatuses(stripeProductId).contains(subscriptionStatus);
    }

}
