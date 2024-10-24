package com.pacvue.h10.customer.api.infrastructure.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable {

    private Long id;

    private Long accountId;

    private String email;

    public UserInfo(Long id, Long accountId) {
        this.id = id;
        this.accountId = accountId;
    }
}
