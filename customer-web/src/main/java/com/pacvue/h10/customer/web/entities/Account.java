package com.pacvue.h10.customer.web.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.Instant;

/**
 * @TableName Account
 */
@TableName(value ="Account")
@Data
public class Account {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     *
     */
    @TableField(value = "status")
    private Integer status;

    /**
     *
     */
    @TableField(value = "stripe_customer_id")
    private String stripe_customer_id;

    /**
     *
     */
    @TableField(value = "showFeedbackNeededAlert")
    private Boolean showFeedbackNeededAlert;

    /**
     *
     */
    @TableField(value = "hashId")
    private String hashId;

    /**
     *
     */
    @TableField(value = "leadCreatedAt")
    private Integer leadCreatedAt;

    /**
     *
     */
    @TableField(value = "leadMergedAt")
    private Integer leadMergedAt;

    /**
     *
     */
    @TableField(value = "perfomanceDashboardReady")
    private Boolean perfomanceDashboardReady;

    /**
     *
     */
    @TableField(value = "profitsWanted")
    private Boolean profitsWanted;

    /**
     *
     */
    @TableField(value = "profitsEnabledAt")
    private Integer profitsEnabledAt;

    /**
     *
     */
    @TableField(value = "defaultCurrency")
    private String defaultCurrency;

    /**
     *
     */
    @TableField(value = "followupEnabled")
    private Boolean followupEnabled;

    /**
     *
     */
    @TableField(value = "followupEnabledAt")
    private Instant followupEnabledAt;

    /**
     *
     */
    @TableField(value = "isPrivileged")
    private Boolean isPrivileged;

    /**
     *
     */
    @TableField(value = "markDeletedAt")
    private Integer markDeletedAt;

    /**
     *
     */
    @TableField(value = "ppcEnabled")
    private Boolean ppcEnabled;

    /**
     *
     */
    @TableField(value = "ppcEnabledAt")
    private Instant ppcEnabledAt;

    /**
     *
     */
    @TableField(value = "ppcNdaSigned")
    private Boolean ppcNdaSigned;

    /**
     *
     */
    @TableField(value = "ppcNdaSignedAt")
    private Instant ppcNdaSignedAt;

    /**
     *
     */
    @TableField(value = "marketTrackerBearerToken")
    private String marketTrackerBearerToken;

    /**
     *
     */
    @TableField(value = "portalsEnabled")
    private Boolean portalsEnabled;

    /**
     *
     */
    @TableField(value = "portalsEnabledAt")
    private Integer portalsEnabledAt;

    /**
     *
     */
    @TableField(value = "identifiedInSegmentAt")
    private Integer identifiedInSegmentAt;

    /**
     *
     */
    @TableField(value = "source")
    private String source;

    /**
     *
     */
    @TableField(value = "profitsStarted")
    private Boolean profitsStarted;

    /**
     *
     */
    @TableField(value = "profitsStartedAt")
    private Long profitsStartedAt;

    /**
     *
     */
    @TableField(value = "accountName")
    private String accountName;

    /**
     *
     */
    @TableField(value = "createdAt")
    private Integer createdAt;

    /**
     *
     */
    @TableField(value = "inventoryStarted")
    private Boolean inventoryStarted;

    /**
     *
     */
    @TableField(value = "inventoryStartedAt")
    private Long inventoryStartedAt;

    /**
     * True if account is migrated or initially created in Adtomic
     */
    @TableField(value = "adtomicEnabled")
    private Boolean adtomicEnabled;

    /**
     *
     */
    @TableField(value = "adtomicEnabledAt")
    private Long adtomicEnabledAt;

    /**
     *
     */
    @TableField(value = "cardCountryIsoCode")
    private String cardCountryIsoCode;
}
