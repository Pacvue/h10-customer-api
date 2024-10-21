package com.pacvue.h10.customer.api.exception;

import com.pacvue.common.error.ErrorCode;

public class CustomErrorCode implements ErrorCode {

    private int code;

    private String message;

    public CustomErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int code() {
        return this.code;
    }

    @Override
    public String message() {
        return this.message;
    }
}
