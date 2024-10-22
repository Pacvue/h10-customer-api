package com.pacvue.h10.customer.api.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AuthenticateException extends RuntimeException {

    private CustomErrorCode errorCode;

    public AuthenticateException(CustomErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
