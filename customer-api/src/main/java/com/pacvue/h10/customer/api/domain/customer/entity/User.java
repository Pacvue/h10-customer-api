package com.pacvue.h10.customer.api.domain.customer.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName user
 */
@Table(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @Id(value = "id")
    private Integer id;

    /**
     * 
     */
    @Column(value = "username")
    private String username;

    /**
     * 
     */
    @Column(value = "auth_key")
    private String authKey;

    /**
     * 
     */
    @Column(value = "password_hash")
    private String passwordHash;

    /**
     * 
     */
    @Column(value = "password_reset_token")
    private String passwordResetToken;

    /**
     * 
     */
    @Column(value = "email")
    private String email;

    /**
     * 
     */
    @Column(value = "status")
    private Integer status;

    /**
     * 
     */
    @Column(value = "created_at")
    private Integer createdAt;

    /**
     * 
     */
    @Column(value = "updated_at")
    private Integer updatedAt;

    /**
     * 
     */
    @Column(value = "activation_token")
    private String activationToken;

    /**
     * 
     */
    @Column(value = "new_email")
    private String newEmail;

    /**
     * 
     */
    @Column(value = "auth_token")
    private String authToken;

    /**
     * 
     */
    @Column(value = "auth_token_created_at")
    private Integer authTokenCreatedAt;

    /**
     * 
     */
    @Column(value = "auth_key_updated_at")
    private Integer authKeyUpdatedAt;

    /**
     * 
     */
    @Column(value = "full_name")
    private String fullName;

    /**
     * 
     */
    @Column(value = "first_name")
    private String firstName;

    /**
     * 
     */
    @Column(value = "last_name")
    private String lastName;

    /**
     * 
     */
    @Column(value = "phone")
    private String phone;

    /**
     * 
     */
    @Column(value = "phoneConfirmed")
    private Boolean phoneConfirmed;

    /**
     * 
     */
    @Column(value = "address")
    private String address;

    /**
     * 
     */
    @Column(value = "verified")
    private Boolean verified;

    /**
     * 
     */
    @Column(value = "lastSignInAt")
    private Integer lastSignInAt;

    /**
     * 
     */
    @Column(value = "markDeletedAt")
    private Integer markDeletedAt;

    /**
     * 
     */
    @Column(value = "emailConfirmedAt")
    private Integer emailConfirmedAt;

    /**
     * 
     */
    @Column(value = "defaultLanguage")
    private String defaultLanguage;

    /**
     * 
     */
    @Column(value = "countryIsoCode")
    private String countryIsoCode;

    /**
     * 
     */
    @Column(value = "state")
    private String state;

    /**
     * 
     */
    @Column(value = "city")
    private String city;

    /**
     * 
     */
    @Column(value = "street")
    private String street;

    /**
     * 
     */
    @Column(value = "zipCode")
    private String zipCode;
}