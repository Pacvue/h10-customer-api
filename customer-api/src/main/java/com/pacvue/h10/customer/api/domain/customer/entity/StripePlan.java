package com.pacvue.h10.customer.api.domain.customer.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;

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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getIntervalCount() {
        return intervalCount;
    }

    public void setIntervalCount(Integer intervalCount) {
        this.intervalCount = intervalCount;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    public Integer getTrialPeriodDays() {
        return trialPeriodDays;
    }

    public void setTrialPeriodDays(Integer trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
    }

    public Integer getAmountCredits() {
        return amountCredits;
    }

    public void setAmountCredits(Integer amountCredits) {
        this.amountCredits = amountCredits;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getBillingScheme() {
        return billingScheme;
    }

    public void setBillingScheme(String billingScheme) {
        this.billingScheme = billingScheme;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBasePlan() {
        return basePlan;
    }

    public void setBasePlan(String basePlan) {
        this.basePlan = basePlan;
    }

    public Object getExtendedLimits() {
        return extendedLimits;
    }

    public void setExtendedLimits(Object extendedLimits) {
        this.extendedLimits = extendedLimits;
    }
}
