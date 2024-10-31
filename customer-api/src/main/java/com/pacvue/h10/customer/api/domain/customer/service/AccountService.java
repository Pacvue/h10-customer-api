package com.pacvue.h10.customer.api.domain.customer.service;

import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import com.pacvue.h10.customer.dto.response.AccountDto;

import java.util.List;

public interface AccountService {

    /**
     * Returns a list of accounts available to the user
     */
    List<AccountDto> getAccounts(Integer userId);

    String getSubscriptionPlan(Boolean base, Boolean forceHeliumPlanId, Integer id);

    /**
     * check if the account is subscribed to the module
     */
    Boolean getIsSubscriber(Integer id, String moduleId);

    /**
     * check if the account has a paid subscription
     */
    Boolean hasPaidSubscription(StripeSubscription stripeSubscription, String moduleId);

    Boolean hasToolAccess(String tool);

    Boolean isToolIncludedInCurrentPlan(String tool);
}
