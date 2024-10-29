package com.pacvue.h10.customer.api.controller;

import com.pacvue.h10.customer.api.domain.customer.entity.Account;
import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import com.pacvue.h10.customer.api.domain.customer.entity.User;
import com.pacvue.h10.customer.api.domain.customer.entity.User2Account;
import com.pacvue.h10.customer.api.domain.customer.mapper.AccountMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.StripeSubscriptionMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.User2AccountMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.UserMapper;
import com.pacvue.h10.customer.api.domain.customer.service.CustomerService;
import com.pacvue.h10.customer.api.exception.BadRequestHttpException;
import com.pacvue.h10.customer.api.exception.CustomErrorCode;
import com.pacvue.h10.customer.api.infrastructure.config.UserContext;
import com.pacvue.h10.customer.dto.request.UpsellInfoReqDto;
import com.pacvue.h10.customer.dto.response.AccountDto;
import com.pacvue.h10.customer.dto.response.CustomerAdDataDto;
import com.pacvue.h10.customer.dto.response.ResponseData;
import com.pacvue.h10.customer.dto.response.UpsellInfoDto;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
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
    @Resource
    private AccountMapper accountMapper;
    @Resource
    private StripeSubscriptionMapper stripeSubscriptionMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private User2AccountMapper user2AccountMapper;

    @GetMapping("accounts")
    public Map<Long, AccountDto> accounts() {
        List<AccountDto> accounts = customerService.getAccounts(1L);
        return accounts.stream().collect(Collectors.toMap(AccountDto::getAccountId, Function.identity()));
    }

    /**
     * Get ADS-specific customer data
     */
    @GetMapping("me/ads")
    public ResponseData<CustomerAdDataDto> meAds() {
        CustomerAdDataDto dataDto = new CustomerAdDataDto();
        customerService.meAds();
        return ResponseData.success(dataDto);
    }

    /**
     * Get upsell info of a module for an Account
     */
    @GetMapping("uses/upsell-info")
    public ResponseData<UpsellInfoDto> upsellInfo(UpsellInfoReqDto reqDto) {
        UpsellInfoDto dataDto = new UpsellInfoDto();
        if (ObjectUtils.isEmpty(reqDto.getModuleId())) {
            throw new BadRequestHttpException(new CustomErrorCode(400, "moduleId is required"));
        }
        // UserContext.getUser().getAccountId()
        UpsellInfoDto upsellInfo = customerService.upsellInfo(1L, reqDto.getModuleId(), reqDto.getSuggestedPlans());
        return ResponseData.success(upsellInfo);
    }
}
