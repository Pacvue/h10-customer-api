package com.pacvue.h10.customer.api.domain.customer.service;


import com.pacvue.h10.customer.api.domain.customer.entity.PpcTokenOfAccount;
import com.mybatisflex.core.service.IService;

import static com.pacvue.h10.customer.api.domain.customer.entity.table.AccountTableDef.ACCOUNT;

/**
 * 服务层。
 *
 * @author mybatis-flex-helper automatic generation
 * @since 1.0
 */
public interface PpcTokenOfAccountService extends IService<PpcTokenOfAccount> {

    Boolean doesAccountHavePpcToken(Integer accountId);
}