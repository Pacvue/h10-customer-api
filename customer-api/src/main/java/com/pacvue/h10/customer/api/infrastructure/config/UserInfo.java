package com.pacvue.h10.customer.api.infrastructure.config;

import com.pacvue.h10.customer.api.domain.customer.entity.Account;
import com.pacvue.h10.customer.api.domain.customer.entity.StripeSubscription;
import com.pacvue.h10.customer.api.domain.customer.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable {

    private User user;

    private Account account;

    private StripeSubscription stripeSubscription;
}
