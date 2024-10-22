package com.pacvue.h10.customer.api.controller;

import com.pacvue.h10.customer.api.domain.customer.service.CustomerService;
import com.pacvue.h10.customer.api.infrastructure.config.UserContext;
import com.pacvue.h10.customer.dto.response.AccountDto;
import com.pacvue.h10.customer.dto.response.CustomerAdDataDto;
import com.pacvue.h10.customer.dto.response.ResponseData;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @GetMapping("accounts")
    public Map<Long, AccountDto> accounts() {
        List<AccountDto> accounts = customerService.getAccounts(UserContext.getUser().getId());
        return accounts.stream().collect(Collectors.toMap(AccountDto::getAccountId, Function.identity()));
    }

    /**
     * Get ADS-specific customer data
     */
    @GetMapping("me/ads")
    public ResponseData<CustomerAdDataDto> meAds() {
        CustomerAdDataDto dataDto = new CustomerAdDataDto();
//        dataDto.setId(1L);
        return ResponseData.success(dataDto);
    }
}
