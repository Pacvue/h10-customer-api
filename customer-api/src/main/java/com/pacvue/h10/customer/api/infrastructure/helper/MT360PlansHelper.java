package com.pacvue.h10.customer.api.infrastructure.helper;

import org.springframework.stereotype.Component;

@Component
public class MT360PlansHelper {

    public static String MODULE_ID = "mt360";

    public boolean isAddonBoughtInAccount(String s) {
        return true;
    }
}
