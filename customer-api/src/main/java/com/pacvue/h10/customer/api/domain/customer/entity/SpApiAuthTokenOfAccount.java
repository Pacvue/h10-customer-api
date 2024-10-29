package com.pacvue.h10.customer.api.domain.customer.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 实体类。
 *
 * @author mybatis-flex-helper automatic generation
 * @since 1.0
 */
@Table(value = "SpApiAuthTokenOfAccount")
@Data
public class SpApiAuthTokenOfAccount {

    @Id(keyType = KeyType.Auto)
    private Integer id;

    @Column(value = "Account_id")
    private Long accountId;

    @Column(value = "sellerId")
    private String sellerId;

    @Column(value = "refreshToken")
    private String refreshToken;

    @Column(value = "spApiOauthCode")
    private String spApiOauthCode;

    @Column(value = "marketplaceList")
    private Object marketplaceList;

    @Column(value = "status")
    private Boolean status;

    @Column(value = "statusData")
    private String statusData;

    @Column(value = "region")
    private String region;

    @Column(value = "alias")
    private String alias;

    @Column(value = "disabledAt")
    private Timestamp disabledAt;

    @Column(value = "createdAt")
    private Timestamp createdAt;

    @Column(value = "isVendorCentralToken")
    private Boolean isVendorCentralToken;
}
