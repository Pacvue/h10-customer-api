package com.pacvue.h10.customer.api.infrastructure.enums;

import lombok.Getter;

@Getter
public enum PpcTokenOfAccountEnum {

//    public const STATUS_NEW = 0;
//    public const STATUS_WAITING = 1;
//    public const STATUS_READY = 2;
//    public const STATUS_DEMO = 333;
//    public const STATUS_TOKEN_IS_INVALID = 101;
//
//    public const STATUS_REMOVED = 100;
//    public const STATUS_DISABLED = 102;


    STATUS_NEW(0),
    STATUS_WAITING(1),
    STATUS_READY(2),
    STATUS_REMOVED(100),
    STATUS_TOKEN_IS_INVALID(101),
    STATUS_DISABLED(102),
    STATUS_DEMO(333);

    private final int status;

    PpcTokenOfAccountEnum(int status) {
        this.status = status;
    }
}
