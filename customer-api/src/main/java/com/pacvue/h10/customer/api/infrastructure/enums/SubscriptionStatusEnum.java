package com.pacvue.h10.customer.api.infrastructure.enums;

import lombok.Getter;

public enum SubscriptionStatusEnum {

    STATUS_ACTIVE("active"),

    STATUS_CANCELED("canceled"),

    STATUS_INCOMPLETE("incomplete"),
    STATUS_INCOMPLETE_EXPIRED("incomplete_expired"),
    STATUS_PAST_DUE("past_due"),
    STATUS_PAUSED("paused"),
    STATUS_TRIALING("trialing"),
    STATUS_UNPAID("unpaid");


    @Getter
    private final String status;

    SubscriptionStatusEnum(String status) {
        this.status = status;
    }
}
