package com.pacvue.customer.common;

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
