package com.pacvue.h10.customer.api.domain.customer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName AuthToken
 */
@TableName(value ="\"AuthToken\"")
@Data
public class AuthToken implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Integer id;

    /**
     * 
     */
    @TableField(value = "\"Account_id\"")
    private Long accountId;

    /**
     * 
     */
    @TableField(value = "token")
    private String token;

    /**
     * 
     */
    @TableField(value = "ua")
    private String ua;

    /**
     * 
     */
    @TableField(value = "ip")
    private String ip;

    /**
     * 
     */
    @TableField(value = "\"createdAt\"")
    private Date createdAt;

    /**
     * 
     */
    @TableField(value = "\"isActive\"")
    private Boolean isActive;

    /**
     * 
     */
    @TableField(value = "\"instantHash\"")
    private String instantHash;

    /**
     * 
     */
    @TableField(value = "\"isHashUsed\"")
    private Boolean isHashUsed;

    /**
     * 
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * ID unique for user session
     */
    @TableField(value = "sid")
    private String sid;

    /**
     * 
     */
    @TableField(value = "source")
    private String source;

    /**
     * 
     */
    @TableField(value = "\"sessionToken\"")
    private String sessionToken;

    /**
     * 
     */
    @TableField(value = "\"isAdminSuperLogin\"")
    private Boolean isAdminSuperLogin;
}