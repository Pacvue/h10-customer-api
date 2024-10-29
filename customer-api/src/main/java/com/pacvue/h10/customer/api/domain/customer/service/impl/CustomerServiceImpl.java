package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.mybatisflex.core.query.QueryWrapper;
import com.pacvue.h10.customer.api.domain.customer.entity.*;
import com.pacvue.h10.customer.api.domain.customer.mapper.*;
import com.pacvue.h10.customer.api.domain.customer.service.AccountService;
import com.pacvue.h10.customer.api.domain.customer.service.CustomerService;
import com.pacvue.h10.customer.dto.response.AccountDto;
import com.pacvue.h10.customer.dto.response.UpsellInfoDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.pacvue.h10.customer.api.domain.customer.entity.table.SpApiAuthTokenOfAccountTableDef.SP_API_AUTH_TOKEN_OF_ACCOUNT;
import static com.pacvue.h10.customer.api.domain.customer.entity.table.StripeSubscriptionTableDef.STRIPE_SUBSCRIPTION;


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

    @Override
    public UpsellInfoDto upsellInfo(Long accountId, String moduleId, List<String> suggestedPlans) {


        return null;
    }

    @Override
    public void meAds() {
        User user = userMapper.selectOneById(1L);
        Account account = accountMapper.selectOneById(1L);
        List<SpApiAuthTokenOfAccount> spApiAuthTokenOfAccounts = spApiAuthTokenOfAccountMapper.selectListByQuery(QueryWrapper.create().select().where(SP_API_AUTH_TOKEN_OF_ACCOUNT.ACCOUNT_ID.eq(account.getId())));
        StripeSubscription stripeSubscription = stripeSubscriptionMapper.selectOneByQuery(QueryWrapper.create().select().where(STRIPE_SUBSCRIPTION.ACCOUNT_ID.eq(account.getId())));
        accountService.getSubscriptionPlan(true, false, null);

    }
}
