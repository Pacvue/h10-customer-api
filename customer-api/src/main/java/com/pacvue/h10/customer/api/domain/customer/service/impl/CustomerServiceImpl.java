package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.mybatisflex.core.query.QueryWrapper;
import com.pacvue.h10.customer.api.domain.customer.entity.*;
import com.pacvue.h10.customer.api.domain.customer.mapper.*;
import com.pacvue.h10.customer.api.domain.customer.service.AccountService;
import com.pacvue.h10.customer.api.domain.customer.service.CustomerService;
import com.pacvue.h10.customer.api.domain.customer.service.PpcTokenOfAccountService;
import com.pacvue.h10.customer.api.infrastructure.config.UserContext;
import com.pacvue.h10.customer.api.infrastructure.config.UserInfo;
import com.pacvue.h10.customer.api.infrastructure.enums.AddonStateEnum;
import com.pacvue.h10.customer.api.infrastructure.enums.PpcTokenOfAccountEnum;
import com.pacvue.h10.customer.api.infrastructure.helper.AddonsHelper;
import com.pacvue.h10.customer.api.infrastructure.helper.ToolsHelper;
import com.pacvue.h10.customer.dto.response.CustomerAdDataDto;
import com.pacvue.h10.customer.dto.response.UpsellInfoDto;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.pacvue.h10.customer.api.domain.customer.entity.table.PpcTokenOfAccountTableDef.PPC_TOKEN_OF_ACCOUNT;
import static com.pacvue.h10.customer.api.domain.customer.entity.table.SpApiAuthTokenOfAccountTableDef.SP_API_AUTH_TOKEN_OF_ACCOUNT;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private StripeSubscriptionMapper stripeSubscriptionMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private AccountMapper accountMapper;
    @Resource
    private SpApiAuthTokenOfAccountMapper spApiAuthTokenOfAccountMapper;
    @Resource
    private AccountService accountService;
    @Resource
    private AddonsHelper addonsHelper;
    @Resource
    private PpcTokenOfAccountMapper ppcTokenOfAccountMapper;
    @Resource
    private PpcTokenOfAccountService ppcTokenOfAccountService;

    @Override
    public UpsellInfoDto upsellInfo(Long accountId, String moduleId, List<String> suggestedPlans) {

        return null;
    }

    @Override
    public CustomerAdDataDto meAds() {
        UserInfo userInfo = UserContext.getUser();
        User user = userInfo.getUser();
        Account account = userInfo.getAccount();
        String subscriptionPlan = accountService.getSubscriptionPlan(true, false, account.getId());


        StripeSubscription stripeSubscription = userInfo.getStripeSubscription();

//        List<SpApiAuthTokenOfAccount> spApiAuthTokenOfAccounts = spApiAuthTokenOfAccountMapper.
//                selectListByQuery(QueryWrapper.create().select().where(SP_API_AUTH_TOKEN_OF_ACCOUNT.ACCOUNT_ID.eq(account.getId())));
//
//        CustomerAdDataDto.Subscription subscription = new CustomerAdDataDto.Subscription();
//        subscription.setCoupon(Optional.ofNullable(stripeSubscription).map(StripeSubscription::getCouponId).orElse(null));
//        subscription.setPlan(subscriptionPlan);
//        AddonStateEnum addonStateEnum = addonsHelper.checkAddonState(ToolsHelper.ADTOMIC_TOOL_ID);
//
//        Boolean hasToolAccess = accountService.hasToolAccess(ToolsHelper.ADTOMIC_TOOL_ID);
//        getInvoices();
        CustomerAdDataDto dataDto = CustomerAdDataDto.builder()
                .id(account.getId())
                .userId(user.getId())
                .accountId(account.getId())
                .email(user.getEmail())
                .full_name(user.getFullName())
                .plan(subscriptionPlan)
                .ppc_enabled(isPPCEnabled(account.getId(), account.getPpcEnabled()))
                .has_ppc_token(ppcTokenOfAccountService.doesAccountHavePpcToken(account.getId()))
                .ppc_enabled_raw(account.getPpcEnabled())
                .adtomic_enabled(account.getAdtomicEnabled())

                .build();

        dataDto.setId(user.getId());
        dataDto.setEmail(user.getEmail());
        dataDto.setAccountId(account.getId());
//        dataDto.setSubscription(subscription);
//        dataDto.setPlan(subscriptionPlan);
        return dataDto;
    }

    private Boolean isPPCEnabled(Integer accountId, Boolean ppcEnabled) {
        List<Integer> validStatuses = Arrays.asList(
                PpcTokenOfAccountEnum.STATUS_WAITING.getStatus(),
                PpcTokenOfAccountEnum.STATUS_READY.getStatus(),
                PpcTokenOfAccountEnum.STATUS_DEMO.getStatus());
        PpcTokenOfAccount ppcTokenOfAccount = ppcTokenOfAccountMapper.selectOneByQuery(QueryWrapper.create()
                .where(PPC_TOKEN_OF_ACCOUNT.ACCOUNT_ID.eq(accountId).and(PPC_TOKEN_OF_ACCOUNT.STATUS.in(validStatuses))));
        return ObjectUtils.isNotEmpty(ppcTokenOfAccount) && ppcEnabled;
    }

    private void getInvoices() {
    }
}
