package com.pacvue.h10.customer.api.domain.customer.entity;


import java.io.Serializable;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Table;
import lombok.Data;

/**
 * 
 * @TableName User2Account
 */
@Table(value ="User2Account")
@Data
public class User2Account implements Serializable {
    /**
     * 
     */
    @Column(value = "user_id")
    private Long user_id;

    /**
     * 
     */
    @Column(value = "Account_id")
    private Long account_id;

    /**
     * 
     */
    @Column(value = "role")
    private Integer role;

    /**
     * 
     */
    @Column(value = "permissions")
    private Object permissions;

    /**
     * 
     */
    @Column(value = "status")
    private Integer status;

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
    @Column(value = "activationToken")
    private String activationToken;

    /**
     * 
     */
    @Column(value = "lastActivityAt")
    private Integer lastActivityAt;

    /**
     * 
     */
    @Column(value = "isDefaultAccount")
    private Boolean isDefaultAccount;
}