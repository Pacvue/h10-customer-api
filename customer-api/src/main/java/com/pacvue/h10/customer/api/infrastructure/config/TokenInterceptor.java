package com.pacvue.h10.customer.api.infrastructure.config;

import cn.hutool.crypto.digest.BCrypt;
import com.mybatisflex.core.query.QueryWrapper;
import com.pacvue.h10.customer.api.domain.customer.entity.Account;
import com.pacvue.h10.customer.api.domain.customer.entity.AuthToken;
import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import com.pacvue.h10.customer.api.domain.customer.entity.User;
import com.pacvue.h10.customer.api.domain.customer.mapper.AccountMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.AuthTokenMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.StripeSubscriptionMapper;
import com.pacvue.h10.customer.api.domain.customer.mapper.UserMapper;
import com.pacvue.h10.customer.api.exception.AuthenticateException;
import com.pacvue.h10.customer.api.exception.CustomErrorCode;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Collections;

import static com.pacvue.h10.customer.api.domain.customer.entity.table.StripeSubscriptionTableDef.STRIPE_SUBSCRIPTION;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    private String BLOWFISH_PREFIX = "$2y$07$";

    @Value("${YII2_API_ACCESS_TOKEN_SALT:localsalt0123456789891}")
    private String salt;
    @Resource
    private AuthTokenMapper authTokenMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private StripeSubscriptionMapper stripeSubscriptionMapper;
    @Resource
    private AccountMapper accountMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        // 从请求参数中取得userId和accountId
        String userId = request.getHeader("x-h10-user_id");
        String accountId = request.getHeader("x-h10-account_id");
        if (ObjectUtils.isNotEmpty(userId) && ObjectUtils.isNotEmpty(accountId)) {
            UserInfo userInfo = getUserInfo(Integer.valueOf(userId), Integer.valueOf(accountId));
            if (ObjectUtils.isNotEmpty(userInfo)) {
                UserContext.setUser(userInfo);
                return true;
            }
        }
        // 从HTTP头信息中取得token
        String token = request.getHeader("Authorization");
        // 实现token验证的逻辑
        if (token == null || !token.startsWith("Bearer ")) {
            throw new AuthenticateException(new CustomErrorCode(0, "Error occurred", "Your request was made with invalid credentials.", Collections.singletonList("user/signin")));
        }
        // 验证token
        UserInfo userInfo = getUserInfoFromToken(token.substring("Bearer ".length()));
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new AuthenticateException(new CustomErrorCode(0, "Error occurred", "Your request was made with invalid credentials.", Collections.singletonList("user/signin")));
        }
        UserContext.setUser(userInfo);
        return true;
    }

    /**
     * 查询user/account/subscription 信息
     *
     * @param token token
     */
    private UserInfo getUserInfoFromToken(String token) {
        String saltToken = BCrypt.hashpw(token, BLOWFISH_PREFIX + salt);
        QueryWrapper wrapper = QueryWrapper.create();
        wrapper.eq(AuthToken::getToken, saltToken);
        AuthToken authToken = authTokenMapper.selectOneByQuery(wrapper);
        if (ObjectUtils.isEmpty(authToken)) {
            return null;
        }
        return getUserInfo(authToken.getUserId(), authToken.getAccountId());
    }

    private UserInfo getUserInfo(Integer userId, Integer accountId) {
        User user = userMapper.selectOneById(userId);
        Account account = accountMapper.selectOneById(accountId);
        if (ObjectUtils.isEmpty(user) || ObjectUtils.isEmpty(account)) {
            return null;
        }
//        StripeSubscription stripeSubscription = stripeSubscriptionMapper.selectOneByQuery(QueryWrapper.create().select().where(STRIPE_SUBSCRIPTION.ACCOUNT_ID.eq(account.getId())));
        return new UserInfo(user, account, null);
    }
}
