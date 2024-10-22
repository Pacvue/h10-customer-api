package com.pacvue.h10.customer.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class UpsellInfoReqDto {
    private String moduleId;

    private List<String> suggestedPlans;


}
