package com.pacvue.h10.customer.dto.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName StripeSubscription
 */
@Data
@Builder
public class StripeSubscriptionDto implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String subscriptionId;

    /**
     *
     */
    private Long accountId;

    /**
     *
     */
    private String planId;

    /**
     *
     */
    private Integer createdAt;

    /**
     *
     */
    private Integer updatedAt;

    /**
     *
     */
    private Boolean isActive;

    /**
     *
     */
    private Integer billingPeriodEndAt;

    /**
     *
     */
    private Boolean cancelAtPeriodEnd;

    /**
     *
     */
    private Boolean freePlanNotify;

    /**
     *
     */
    private String couponId;

    /**
     *
     */
    private Integer cardChangedAt;

    /**
     *
     */
    private Integer replenishesAt;

    /**
     *
     */
    private String plansList;

    /**
     *
     */
    private String heliumPlanId;

    /**
     *
     */
    private Boolean isTrial;

    /**
     *
     */
    private Boolean isKtFull;

    /**
     *
     */
    private Boolean isHjaFull;

    /**
     *
     */
    private Integer subscribedAt;

    /**
     *
     */
    private Boolean isIncomplete;

    /**
     *
     */
    private Boolean freedomTicketEnabled;

    /**
     *
     */
    private Boolean ftCouponActivated;

    /**
     *
     */
    private String source;

    /**
     *
     */
    private String stripeProductId;

    /**
     *
     */
    private Integer currentPlanStartedAt;

    /**
     *
     */
    private String status;

    /**
     *
     */
    private String initialPaymentMethod;

    /**
     *
     */
    private String addonsList;
}