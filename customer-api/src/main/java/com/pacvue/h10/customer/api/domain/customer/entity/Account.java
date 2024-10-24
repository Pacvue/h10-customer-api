package com.pacvue.h10.customer.api.domain.customer.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.time.Instant;

/**
 * @TableName Account
 */
@Table(value ="\"Account\"")
@Data
public class Account {

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     *
     */
    @Column(value = "status")
    private Integer status;

    /**
     *
     */
    @Column(value = "stripe_customer_id")
    private String stripe_customer_id;

    /**
     *
     */
    @Column(value = "showFeedbackNeededAlert")
    private Boolean showFeedbackNeededAlert;

    /**
     *
     */
    @Column(value = "hashId")
    private String hashId;

    /**
     *
     */
    @Column(value = "leadCreatedAt")
    private Integer leadCreatedAt;

    /**
     *
     */
    @Column(value = "leadMergedAt")
    private Integer leadMergedAt;

    /**
     *
     */
    @Column(value = "perfomanceDashboardReady")
    private Boolean perfomanceDashboardReady;

    /**
     *
     */
    @Column(value = "profitsWanted")
    private Boolean profitsWanted;

    /**
     *
     */
    @Column(value = "profitsEnabledAt")
    private Integer profitsEnabledAt;

    /**
     *
     */
    @Column(value = "defaultCurrency")
    private String defaultCurrency;

    /**
     *
     */
    @Column(value = "followupEnabled")
    private Boolean followupEnabled;

    /**
     *
     */
    @Column(value = "followupEnabledAt")
    private Instant followupEnabledAt;

    /**
     *
     */
    @Column(value = "isPrivileged")
    private Boolean isPrivileged;

    /**
     *
     */
    @Column(value = "markDeletedAt")
    private Integer markDeletedAt;

    /**
     *
     */
    @Column(value = "ppcEnabled")
    private Boolean ppcEnabled;

    /**
     *
     */
    @Column(value = "ppcEnabledAt")
    private Instant ppcEnabledAt;

    /**
     *
     */
    @Column(value = "ppcNdaSigned")
    private Boolean ppcNdaSigned;

    /**
     *
     */
    @Column(value = "ppcNdaSignedAt")
    private Instant ppcNdaSignedAt;

    /**
     *
     */
    @Column(value = "marketTrackerBearerToken")
    private String marketTrackerBearerToken;

    /**
     *
     */
    @Column(value = "portalsEnabled")
    private Boolean portalsEnabled;

    /**
     *
     */
    @Column(value = "portalsEnabledAt")
    private Integer portalsEnabledAt;

    /**
     *
     */
    @Column(value = "identifiedInSegmentAt")
    private Integer identifiedInSegmentAt;

    /**
     *
     */
    @Column(value = "source")
    private String source;

    /**
     *
     */
    @Column(value = "profitsStarted")
    private Boolean profitsStarted;

    /**
     *
     */
    @Column(value = "profitsStartedAt")
    private Long profitsStartedAt;

    /**
     *
     */
    @Column(value = "accountName")
    private String accountName;

    /**
     *
     */
    @Column(value = "createdAt")
    private Integer createdAt;

    /**
     *
     */
    @Column(value = "inventoryStarted")
    private Boolean inventoryStarted;

    /**
     *
     */
    @Column(value = "inventoryStartedAt")
    private Long inventoryStartedAt;

    /**
     * True if account is migrated or initially created in Adtomic
     */
    @Column(value = "adtomicEnabled")
    private Boolean adtomicEnabled;

    /**
     *
     */
    @Column(value = "adtomicEnabledAt")
    private Long adtomicEnabledAt;

    /**
     *
     */
    @Column(value = "cardCountryIsoCode")
    private String cardCountryIsoCode;
}
