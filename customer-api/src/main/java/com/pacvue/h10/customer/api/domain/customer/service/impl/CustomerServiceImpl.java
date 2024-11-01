package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.mybatisflex.core.query.QueryWrapper;
import com.pacvue.h10.customer.api.domain.customer.entity.*;
import com.pacvue.h10.customer.api.domain.customer.mapper.*;
import com.pacvue.h10.customer.api.domain.customer.service.AccountService;
import com.pacvue.h10.customer.api.domain.customer.service.CustomerService;
import com.pacvue.h10.customer.api.infrastructure.config.ParamsConfig;
import com.pacvue.h10.customer.api.infrastructure.config.UserContext;
import com.pacvue.h10.customer.api.infrastructure.config.UserInfo;
import com.pacvue.h10.customer.api.infrastructure.enums.AddonStateEnum;
import com.pacvue.h10.customer.api.infrastructure.helper.AddonsHelper;
import com.pacvue.h10.customer.api.infrastructure.helper.ToolsHelper;
import com.pacvue.h10.customer.dto.response.AccountDto;
import com.pacvue.h10.customer.dto.response.CustomerAdDataDto;
import com.pacvue.h10.customer.dto.response.UpsellInfoDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
    @Resource
    private AddonsHelper addonsHelper;

    @Override
    public UpsellInfoDto upsellInfo(Long accountId, String moduleId, List<String> suggestedPlans) {

        return null;
    }

    @Override
    public CustomerAdDataDto meAds() {
        CustomerAdDataDto dataDto = new CustomerAdDataDto();
        UserInfo userInfo = UserContext.getUser();
        User user = userInfo.getUser();
        Account account = userInfo.getAccount();
        StripeSubscription stripeSubscription = userInfo.getStripeSubscription();

        List<SpApiAuthTokenOfAccount> spApiAuthTokenOfAccounts = spApiAuthTokenOfAccountMapper.
                selectListByQuery(QueryWrapper.create().select().where(SP_API_AUTH_TOKEN_OF_ACCOUNT.ACCOUNT_ID.eq(account.getId())));

        Map<String, Object> subscriptionExtraDetails = new HashMap<>();
        subscriptionExtraDetails.put("coupon", Optional.ofNullable(stripeSubscription).map(StripeSubscription::getCouponId).orElse(null));
        accountService.getSubscriptionPlan(true, false, account.getId());

        AddonStateEnum addonStateEnum = addonsHelper.checkAddonState(ToolsHelper.ADTOMIC_TOOL_ID);

        Boolean hasToolAccess = accountService.hasToolAccess(ToolsHelper.ADTOMIC_TOOL_ID);
        getInvoices();
        return dataDto;
    }

    private void getInvoices() {
    }
}
