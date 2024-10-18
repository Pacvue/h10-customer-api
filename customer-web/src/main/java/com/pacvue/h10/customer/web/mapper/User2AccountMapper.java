package com.pacvue.h10.customer.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pacvue.h10.customer.web.entities.User;
import com.pacvue.h10.customer.web.entities.User2Account;
import dto.AccountDto;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface User2AccountMapper extends BaseMapper<User2Account> {

    List<AccountDto> getAccountsByUserId(@Param("userId") Long userId);
}
