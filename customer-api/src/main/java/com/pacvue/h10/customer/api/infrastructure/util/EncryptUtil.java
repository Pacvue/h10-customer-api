package com.pacvue.h10.customer.api.infrastructure.util;

import cn.hutool.crypto.digest.BCrypt;

public class EncryptUtil {

    public static String encrypt(String token, String salt) {
        return BCrypt.hashpw(token, salt);
    }
}
