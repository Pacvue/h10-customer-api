package com.pacvue.h10.customer.web.service.impl;

import com.pacvue.h10.customer.web.mapper.User2AccountMapper;
import com.pacvue.h10.customer.web.service.CustomerService;
import dto.AccountDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private User2AccountMapper user2AccountMapper;
    @Override
    public List<AccountDto> getAccounts(Long userId) {
        return user2AccountMapper.getAccountsByUserId(userId);
    }
}
