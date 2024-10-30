package com.pacvue.h10.customer.api.domain.customer.service;

import com.pacvue.h10.customer.dto.response.AccountDto;

import java.util.List;

public interface StripeSubscriptionService {

    String getSubscriptionPlan(Boolean base, Boolean forceHeliumPlanId);
}
