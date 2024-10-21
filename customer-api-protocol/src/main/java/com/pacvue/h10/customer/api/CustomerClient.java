package com.pacvue.h10.customer.api;

import com.pacvue.h10.customer.dto.response.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(value = "customer-api")
public interface CustomerClient {

    @GetMapping("api/v1/customer/accounts")
    Map<Long, AccountDto> accounts();
}
