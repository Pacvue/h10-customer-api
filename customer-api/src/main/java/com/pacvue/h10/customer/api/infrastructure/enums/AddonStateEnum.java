package com.pacvue.h10.customer.api.infrastructure.enums;

import lombok.Getter;

@Getter
public enum AddonStateEnum {

    INCLUDED("included"),

    ADDED("added");

    private final String state;

    AddonStateEnum(String state) {
        this.state = state;
    }
}
