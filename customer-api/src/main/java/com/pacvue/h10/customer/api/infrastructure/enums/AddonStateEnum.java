package com.pacvue.h10.customer.api.infrastructure.enums;

import lombok.Getter;

public enum AddonStateEnum {

    INCLUDE("included"),

    ADDED("added");

    @Getter
    private final String state;

    AddonStateEnum(String state) {
        this.state = state;
    }
}
