package com.pacvue.h10.customer.web.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "username")
    private String username;

    /**
     * 
     */
    @TableField(value = "auth_key")
    private String auth_key;

    /**
     * 
     */
    @TableField(value = "password_hash")
    private String password_hash;

    /**
     * 
     */
    @TableField(value = "password_reset_token")
    private String password_reset_token;

    /**
     * 
     */
    @TableField(value = "email")
    private String email;

    /**
     * 
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 
     */
    @TableField(value = "created_at")
    private Integer created_at;

    /**
     * 
     */
    @TableField(value = "updated_at")
    private Integer updated_at;

    /**
     * 
     */
    @TableField(value = "activation_token")
    private String activation_token;

    /**
     * 
     */
    @TableField(value = "new_email")
    private String new_email;

    /**
     * 
     */
    @TableField(value = "auth_token")
    private String auth_token;

    /**
     * 
     */
    @TableField(value = "auth_token_created_at")
    private Integer auth_token_created_at;

    /**
     * 
     */
    @TableField(value = "auth_key_updated_at")
    private Integer auth_key_updated_at;

    /**
     * 
     */
    @TableField(value = "full_name")
    private String full_name;

    /**
     * 
     */
    @TableField(value = "first_name")
    private String first_name;

    /**
     * 
     */
    @TableField(value = "last_name")
    private String last_name;

    /**
     * 
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 
     */
    @TableField(value = "phoneConfirmed")
    private Boolean phoneConfirmed;

    /**
     * 
     */
    @TableField(value = "address")
    private String address;

    /**
     * 
     */
    @TableField(value = "verified")
    private Boolean verified;

    /**
     * 
     */
    @TableField(value = "lastSignInAt")
    private Integer lastSignInAt;

    /**
     * 
     */
    @TableField(value = "markDeletedAt")
    private Integer markDeletedAt;

    /**
     * 
     */
    @TableField(value = "emailConfirmedAt")
    private Integer emailConfirmedAt;

    /**
     * 
     */
    @TableField(value = "defaultLanguage")
    private String defaultLanguage;

    /**
     * 
     */
    @TableField(value = "countryIsoCode")
    private String countryIsoCode;

    /**
     * 
     */
    @TableField(value = "state")
    private String state;

    /**
     * 
     */
    @TableField(value = "city")
    private String city;

    /**
     * 
     */
    @TableField(value = "street")
    private String street;

    /**
     * 
     */
    @TableField(value = "zipCode")
    private String zipCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}