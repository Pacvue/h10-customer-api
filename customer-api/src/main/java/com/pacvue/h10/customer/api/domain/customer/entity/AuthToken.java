package com.pacvue.h10.customer.api.domain.customer.entity;

import java.io.Serializable;
import java.util.Date;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import lombok.Data;

/**
 * 
 * @TableName AuthToken
 */
@Table(value ="\"AuthToken\"")
@Data
public class AuthToken implements Serializable {
    /**
     * 
     */
    @Id(value = "id")
    private Integer id;

    /**
     * 
     */
    @Column(value = "\"Account_id\"")
    private Long accountId;

    /**
     * 
     */
    @Column(value = "token")
    private String token;

    /**
     * 
     */
    @Column(value = "ua")
    private String ua;

    /**
     * 
     */
    @Column(value = "ip")
    private String ip;

    /**
     * 
     */
    @Column(value = "\"createdAt\"")
    private Date createdAt;

    /**
     * 
     */
    @Column(value = "\"isActive\"")
    private Boolean isActive;

    /**
     * 
     */
    @Column(value = "\"instantHash\"")
    private String instantHash;

    /**
     * 
     */
    @Column(value = "\"isHashUsed\"")
    private Boolean isHashUsed;

    /**
     * 
     */
    @Column(value = "user_id")
    private Integer userId;

    /**
     * ID unique for user session
     */
    @Column(value = "sid")
    private String sid;

    /**
     * 
     */
    @Column(value = "source")
    private String source;

    /**
     * 
     */
    @Column(value = "\"sessionToken\"")
    private String sessionToken;

    /**
     * 
     */
    @Column(value = "\"isAdminSuperLogin\"")
    private Boolean isAdminSuperLogin;
}