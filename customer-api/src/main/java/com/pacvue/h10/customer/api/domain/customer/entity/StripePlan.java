package com.pacvue.h10.customer.api.domain.customer.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

/**
 * 实体类。
 *
 * @author mybatis-flex-helper automatic generation
 * @since 1.0
 */
@Table(value = "StripePlan")
@Data
public class StripePlan {

    @Id(keyType = KeyType.None)
    private String id;

    @Column(value = "amount")
    private Integer amount;

    @Column(value = "created")
    private Integer created;

    @Column(value = "currency")
    private String currency;

    @Column(value = "interval")
    private Integer interval;

    @Column(value = "interval_count")
    private Integer intervalCount;

    @Column(value = "livemode")
    private Boolean livemode;

    @Column(value = "metadata")
    private String metadata;

    @Column(value = "name")
    private String name;

    @Column(value = "statement_descriptor")
    private String statementDescriptor;

    @Column(value = "trial_period_days")
    private Integer trialPeriodDays;

    @Column(value = "amount_credits")
    private Integer amountCredits;

    @Column(value = "updated")
    private Integer updated;

    @Column(value = "description")
    private String description;

    @Column(value = "active")
    private Boolean active;

    @Column(value = "billing_scheme")
    private String billingScheme;

    @Column(value = "type")
    private String type;

    @Column(value = "product")
    private String product;

    @Column(value = "basePlan")
    private String basePlan;

    @Column(value = "extendedLimits")
    private Object extendedLimits;
}
