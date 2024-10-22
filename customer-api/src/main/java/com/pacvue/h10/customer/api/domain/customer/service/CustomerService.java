package com.pacvue.h10.customer.api.domain.customer.service;


import com.pacvue.h10.customer.dto.response.AccountDto;

import java.util.List;

public interface CustomerService {

    /**
     * Returns a list of accounts available to the user
     */
    List<AccountDto> getAccounts(Integer userId);
}
