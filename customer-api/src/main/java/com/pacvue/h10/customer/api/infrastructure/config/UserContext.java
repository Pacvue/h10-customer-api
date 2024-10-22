package com.pacvue.h10.customer.api.infrastructure.config;

import com.pacvue.h10.customer.api.domain.customer.entity.User;

public class UserContext {
    private static final ThreadLocal<UserInfo> threadLocal = new ThreadLocal<>();

    public static void setUser(UserInfo data) {
        threadLocal.set(data);
    }

    public static UserInfo getUser() {
        return threadLocal.get();
    }

    public static void clear() {
        threadLocal.remove();
    }
}
