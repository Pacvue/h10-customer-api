package com.pacvue.h10.customer.web.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName User2Account
 */
@TableName(value ="User2Account")
@Data
public class User2Account implements Serializable {
    /**
     * 
     */
    @TableField(value = "user_id")
    private Long user_id;

    /**
     * 
     */
    @TableField(value = "Account_id")
    private Long account_id;

    /**
     * 
     */
    @TableField(value = "role")
    private Integer role;

    /**
     * 
     */
    @TableField(value = "permissions")
    private Object permissions;

    /**
     * 
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 
     */
    @TableField(value = "createdAt")
    private Integer createdAt;

    /**
     * 
     */
    @TableField(value = "updatedAt")
    private Integer updatedAt;

    /**
     * 
     */
    @TableField(value = "activationToken")
    private String activationToken;

    /**
     * 
     */
    @TableField(value = "lastActivityAt")
    private Integer lastActivityAt;

    /**
     * 
     */
    @TableField(value = "isDefaultAccount")
    private Boolean isDefaultAccount;
}