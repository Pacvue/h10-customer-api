package com.pacvue.h10.customer.api.domain.customer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pacvue.h10.customer.api.domain.customer.entity.User2Account;
import com.pacvue.h10.customer.dto.response.AccountDto;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface User2AccountMapper extends BaseMapper<User2Account> {

    List<AccountDto> getAccountsByUserId(@Param("userId") Long userId);
}
