package com.pacvue.h10.customer.api.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {

    private CustomErrorCode errorCode;

    public BusinessException(CustomErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
