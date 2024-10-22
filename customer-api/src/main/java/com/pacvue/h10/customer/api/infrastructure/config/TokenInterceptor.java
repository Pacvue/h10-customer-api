package com.pacvue.h10.customer.api.infrastructure.config;

import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.pacvue.h10.customer.api.domain.customer.entity.AuthToken;
import com.pacvue.h10.customer.api.domain.customer.mapper.AuthTokenMapper;
import com.pacvue.h10.customer.api.exception.AuthenticateException;
import com.pacvue.h10.customer.api.exception.BusinessException;
import com.pacvue.h10.customer.api.exception.CustomErrorCode;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.http.auth.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.sql.Wrapper;
import java.util.Collections;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    private String BLOWFISH_PREFIX = "$2y$07$";

    @Value("${YII2_API_ACCESS_TOKEN_SALT:localsalt0123456789891}")
    private String salt;
    @Resource
    private AuthTokenMapper authTokenMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 从HTTP头信息中取得token
        String token = request.getHeader("Authorization");
        // 实现token验证的逻辑
        if (token == null || !token.startsWith("Bearer ")) {
            throw new AuthenticateException(new CustomErrorCode(0, "Error occurred", "Your request was made with invalid credentials.", Collections.singletonList("user/signin")));
        }
        // 验证token
        AuthToken authToken = getAuthToken(token.substring("Bearer ".length()));
        if(ObjectUtils.isEmpty(authToken)){
            throw new AuthenticateException(new CustomErrorCode(0, "Error occurred", "Your request was made with invalid credentials.", Collections.singletonList("user/signin")));
        }
        UserInfo userInfo = new UserInfo(authToken.getUserId(), authToken.getAccountId());
        UserContext.setUser(userInfo);
        return true; // 如果token有效，则继续执行请求
    }

    private AuthToken getAuthToken(String token) {
        String saltToken = BCrypt.hashpw(token, BLOWFISH_PREFIX + salt);
        return authTokenMapper.selectOne(Wrappers.<AuthToken>lambdaQuery().eq(AuthToken::getToken, saltToken));
    }
}
