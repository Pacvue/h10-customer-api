package com.pacvue.h10.customer.api.domain.customer.service.impl;


import com.mybatisflex.core.query.QueryWrapper;
import com.pacvue.h10.customer.api.infrastructure.enums.PpcTokenOfAccountEnum;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import com.pacvue.h10.customer.api.domain.customer.service.PpcTokenOfAccountService;
import com.pacvue.h10.customer.api.domain.customer.entity.PpcTokenOfAccount;
import com.pacvue.h10.customer.api.domain.customer.mapper.PpcTokenOfAccountMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

import static com.pacvue.h10.customer.api.domain.customer.entity.table.PpcTokenOfAccountTableDef.PPC_TOKEN_OF_ACCOUNT;

/**
 * 服务层实现。
 *
 * @author mybatis-flex-helper automatic generation
 * @since 1.0
 */
@Service
public class PpcTokenOfAccountServiceImpl extends ServiceImpl<PpcTokenOfAccountMapper, PpcTokenOfAccount> implements PpcTokenOfAccountService {

    @Resource
    private PpcTokenOfAccountMapper ppcTokenOfAccountMapper;

    @Override
    public Boolean doesAccountHavePpcToken(Integer accountId) {
        long count = ppcTokenOfAccountMapper.selectCountByQuery(QueryWrapper.create()
                .where(PPC_TOKEN_OF_ACCOUNT.ACCOUNT_ID.eq(accountId)
                        .and(PPC_TOKEN_OF_ACCOUNT.STATUS.ne(PpcTokenOfAccountEnum.STATUS_REMOVED.getStatus()))));
        return count > 0;
    }
}