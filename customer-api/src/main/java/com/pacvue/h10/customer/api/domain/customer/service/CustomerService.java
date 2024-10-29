package com.pacvue.h10.customer.api.domain.customer.service;


import com.pacvue.h10.customer.dto.response.AccountDto;
import com.pacvue.h10.customer.dto.response.UpsellInfoDto;

import java.util.List;

public interface CustomerService {

    /**
     * Returns a list of accounts available to the user
     */
    List<AccountDto> getAccounts(Long userId);

    /**
     * Get upsell info of a module for an Account
     * @param accountId Account id
     * @param moduleId module id
     * @param suggestedPlans list of suggested plans
     */
    UpsellInfoDto upsellInfo(Long accountId, String moduleId, List<String> suggestedPlans);

    /**
     * Get ADS-specific customer data
     */
    void meAds();
}
