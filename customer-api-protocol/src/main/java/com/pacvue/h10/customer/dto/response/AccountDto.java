package com.pacvue.h10.customer.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountDto implements Serializable {

    private Long accountId;

    private String accountName;

    private Integer role;

    private String permissions;

    private Long createdAt;

    private Boolean isDefaultAccount;
}
