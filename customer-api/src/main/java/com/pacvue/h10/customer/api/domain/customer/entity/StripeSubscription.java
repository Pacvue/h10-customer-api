package com.pacvue.h10.customer.api.domain.customer.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import com.mybatisflex.core.handler.Fastjson2TypeHandler;
import com.mybatisflex.core.handler.JacksonTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.ArrayTypeHandler;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @TableName StripeSubscription
 */
@Table(value = "StripeSubscription")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class StripeSubscription implements Serializable {
    /**
     *
     */
    @Id(value = "id", keyType = KeyType.Auto)
    private Long id;

    /**
     *
     */
    @Column(value = "subscription_id")
    private String subscriptionId;

    /**
     *
     */
    @Column(value = "Account_id")
    private Integer accountId;

    /**
     *
     */
    @Column(value = "plan_id")
    private String planId;

    /**
     *
     */
    @Column(value = "createdAt")
    private Integer createdAt;

    /**
     *
     */
    @Column(value = "updatedAt")
    private Integer updatedAt;

    /**
     *
     */
    @Column(value = "isActive")
    private Boolean isActive;

    /**
     *
     */
    @Column(value = "billingPeriodEndAt")
    private Integer billingPeriodEndAt;

    /**
     *
     */
    @Column(value = "cancelAtPeriodEnd")
    private Boolean cancelAtPeriodEnd;

    /**
     *
     */
    @Column(value = "freePlanNotify")
    private Boolean freePlanNotify;

    /**
     *
     */
    @Column(value = "couponId")
    private String couponId;

    /**
     *
     */
    @Column(value = "cardChangedAt")
    private Integer cardChangedAt;

    /**
     *
     */
    @Column(value = "replenishesAt")
    private Integer replenishesAt;

    /**
     *
     */
    @Column(value = "plansList", typeHandler = Fastjson2TypeHandler.class)
    private List<String> plansList;

    /**
     *
     */
    @Column(value = "heliumPlanId")
    private String heliumPlanId;

    /**
     *
     */
    @Column(value = "isTrial")
    private Boolean isTrial;

    /**
     *
     */
    @Column(value = "isKtFull")
    private Boolean isKtFull;

    /**
     *
     */
    @Column(value = "isHjaFull")
    private Boolean isHjaFull;

    /**
     *
     */
    @Column(value = "subscribedAt")
    private Integer subscribedAt;

    /**
     *
     */
    @Column(value = "isIncomplete")
    private Boolean isIncomplete;

    /**
     *
     */
    @Column(value = "freedomTicketEnabled")
    private Boolean freedomTicketEnabled;

    /**
     *
     */
    @Column(value = "ftCouponActivated")
    private Boolean ftCouponActivated;

    /**
     *
     */
    @Column(value = "source")
    private String source;

    /**
     *
     */
    @Column(value = "StripeProduct_id")
    private String stripeProductId;

    /**
     *
     */
    @Column(value = "currentPlanStartedAt")
    private Integer currentPlanStartedAt;

    /**
     *
     */
    @Column(value = "status")
    private String status;

    /**
     *
     */
    @Column(value = "initialPaymentMethod")
    private String initialPaymentMethod;

    /**
     *
     */
    @Column(value = "addonsList", typeHandler = Fastjson2TypeHandler.class)
    private Map<String, Object> addonsList;
}