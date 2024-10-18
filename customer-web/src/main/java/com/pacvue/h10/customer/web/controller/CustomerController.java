package com.pacvue.h10.customer.web.controller;

import com.pacvue.h10.customer.web.service.CustomerService;
import dto.AccountDto;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @GetMapping("accounts")
    public Map<Long, AccountDto> accounts() {
        List<AccountDto> accounts = customerService.getAccounts(1L);
        return accounts.stream().collect(Collectors.toMap(AccountDto::getAccountId, Function.identity()));
    }
}
