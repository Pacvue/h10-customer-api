package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.mybatisflex.core.query.QueryWrapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.StripeSubscriptionMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.User2AccountMapper;
import com.pacvue.h10.customer.api.domain.customer.service.CustomerService;
import com.pacvue.h10.customer.dto.response.AccountDto;
import com.pacvue.h10.customer.dto.response.UpsellInfoDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import java.util.List;

import static com.pacvue.h10.customer.api.domain.customer.entity.table.StripeSubscriptionTableDef.STRIPE_SUBSCRIPTION;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private User2AccountMapper user2AccountMapper;
    @Resource
    private StripeSubscriptionMapper stripeSubscriptionMapper;
    @Override
    public List<AccountDto> getAccounts(Integer userId) {
        return user2AccountMapper.getAccountsByUserId(userId);
    }

    @Override
    public UpsellInfoDto upsellInfo(Long accountId, String moduleId, List<String> suggestedPlans) {
        QueryWrapper wrapper = QueryWrapper.create().select().where(STRIPE_SUBSCRIPTION.ACCOUNT_ID.eq(accountId));
        StripeSubscription stripeSubscription = stripeSubscriptionMapper.selectOneByQuery(wrapper);
        return null;
    }
}
