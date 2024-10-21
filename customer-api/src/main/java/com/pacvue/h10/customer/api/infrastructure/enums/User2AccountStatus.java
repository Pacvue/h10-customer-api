package com.pacvue.h10.customer.api.infrastructure.enums;

import lombok.Getter;

public enum User2AccountStatus {

    ACTIVE(1),

    INVITED(2),

    DELETED(3);

    @Getter
    private final Integer status;

    User2AccountStatus(int status) {
        this.status = status;
    }
}
