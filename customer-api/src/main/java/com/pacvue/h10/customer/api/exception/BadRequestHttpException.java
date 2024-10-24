package com.pacvue.h10.customer.api.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BadRequestHttpException extends RuntimeException {

    private CustomErrorCode errorCode;

    public BadRequestHttpException(CustomErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
