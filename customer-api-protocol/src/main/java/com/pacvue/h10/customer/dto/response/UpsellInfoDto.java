package com.pacvue.h10.customer.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * upsell info of a module for an Account
 */
@Data
public class UpsellInfoDto implements Serializable {

    private String plan;

    private String basePlan;

    private Boolean isChinesePlans;

    private String countryIsoCode;

    private AvailablePlans availablePlans;

    private String suggestedPlansData;

    @Data
    public static class AvailablePlans {
        private List<String> monthlyPlans;

        private List<String> annualPlans;
    }
}
