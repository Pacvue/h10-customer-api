package com.pacvue.h10.customer.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAdDataDto implements Serializable {

    private Integer id;

    private Integer userId;

    private Integer accountId;

    private String email;

    private String full_name;

    private String plan;

    private Boolean ppc_enabled;

    private Boolean has_ppc_token;

    private Boolean ppc_enabled_raw;

    private Boolean adtomic_enabled;

    private Boolean hasGoogleAdsToken;

    private Boolean hasAccess;

    private Boolean hasEliteAccess;

    private Boolean hasMultipleTokensAccess;

    private Boolean isAccessIncluded;

    private Boolean isAccessAdded;

    private Boolean canGetAccess;

    private Boolean isActualPlan;

    private Subscription subscription;

    private LocalDate memberSince;

    private OwnerSubscription ownerSubscription;

    private List<String> merchant_ids;

    private List<String> invoices;

    @Data
    public static class Subscription {
        private String coupon;

        private String plan;
    }

    @Data
    public static class OwnerSubscription {
        private String coupon;

        private String plan;
    }
}
