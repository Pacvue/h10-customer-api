package com.pacvue.h10.customer.api.domain.customer.service;

public interface AccountService {

    String getSubscriptionPlan(Boolean base, Boolean forceHeliumPlanId);

    Boolean getIsSubscriber(Long accountId, String moduleId);
}
