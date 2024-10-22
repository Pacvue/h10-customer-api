package com.pacvue.h10.customer.api.domain.customer.service.impl;

import com.pacvue.h10.customer.api.domain.customer.mapper.User2AccountMapper;
import com.pacvue.h10.customer.api.domain.customer.service.CustomerService;
import com.pacvue.h10.customer.dto.response.AccountDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private User2AccountMapper user2AccountMapper;
    @Override
    public List<AccountDto> getAccounts(Integer userId) {
        return user2AccountMapper.getAccountsByUserId(userId);
    }
}
