package com.pacvue.h10.customer.web.service;

import dto.AccountDto;

import java.util.List;

public interface CustomerService {

    /**
     * Returns a list of accounts available to the user
     */
    List<AccountDto> getAccounts(Long userId);
}
