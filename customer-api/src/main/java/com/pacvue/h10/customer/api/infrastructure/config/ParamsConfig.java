package com.pacvue.h10.customer.api.infrastructure.config;

import com.pacvue.h10.customer.api.infrastructure.helper.PlansHelper;
import com.pacvue.h10.customer.api.infrastructure.helper.ToolsHelper;

import java.util.*;

public class ParamsConfig {

    public static Boolean areDownloadMobileAppBannersShown = false;
    public static String adminEmail = "admin@example.com";
    public static String supportEmail = "support@example.com";
    public static Integer user_passwordResetTokenExpire = 3600;
    public static String audittrail_table = "{{%AuditTrail}}";
    public static List<String> allowedOrigins = new ArrayList<>();
    public static Map<String, Map<String, Object>> plansOptions = new HashMap<>() {{
        Map<String, Object> HELIUM10_FREE_PLAN = new HashMap<>();
        HELIUM10_FREE_PLAN.put("interval", PlansHelper.PLANS_INTERVAL_MONTH);
        HELIUM10_FREE_PLAN.put("intervalCount", PlansHelper.PLANS_INTERVAL_COUNT_1);
        HELIUM10_FREE_PLAN.put("header", "FREE");
        HELIUM10_FREE_PLAN.put("name", "Helium 10 Free");
        HELIUM10_FREE_PLAN.put("defaultDescription", "getHelium10Taste");
        HELIUM10_FREE_PLAN.put("type", "plan");
        HELIUM10_FREE_PLAN.put("planId", PlansHelper.HELIUM10_FREE_PLAN);
        HELIUM10_FREE_PLAN.put("image", "free_200.jpg");
        HELIUM10_FREE_PLAN.put("free", true);
        HELIUM10_FREE_PLAN.put("cssClass", "plan-free");
        HELIUM10_FREE_PLAN.put("showSubscribersOnly", true);
        Map<String, String> pricingChip = new HashMap<>();
        pricingChip.put("color", "gray");
        pricingChip.put("text", "chips.currentPlan");
        HELIUM10_FREE_PLAN.put("pricingChip", pricingChip);
        plansOptions.put(PlansHelper.HELIUM10_FREE_PLAN, HELIUM10_FREE_PLAN);
    }};

    public static Map<String, Map<String, Object>> tools = new HashMap<>() {{
        Map<String, Object> AI_ADVERTISING_TOOL_ID = new HashMap<>();
        AI_ADVERTISING_TOOL_ID.put("id", ToolsHelper.AI_ADVERTISING_TOOL_ID);
        AI_ADVERTISING_TOOL_ID.put("name", "AI Advertising");
        AI_ADVERTISING_TOOL_ID.put("descr", "Set AI-Powered Performance Goals for Your Products");
        AI_ADVERTISING_TOOL_ID.put("section", "Research");
        AI_ADVERTISING_TOOL_ID.put("svg-icon", "");
        AI_ADVERTISING_TOOL_ID.put("svg-class", "");
        AI_ADVERTISING_TOOL_ID.put("env", "prod");
        AI_ADVERTISING_TOOL_ID.put("suffix", "uses");
        AI_ADVERTISING_TOOL_ID.put("category", ToolsHelper.CATEGORY_ADVERTISING);
        AI_ADVERTISING_TOOL_ID.put("showInNewSidebar", false);
        AI_ADVERTISING_TOOL_ID.put("isNew", true);
        AI_ADVERTISING_TOOL_ID.put("usesSpecialText", Collections.emptyList());
        tools.put(ToolsHelper.AI_ADVERTISING_TOOL_ID, AI_ADVERTISING_TOOL_ID);

        Map<String, Object> DAYPARTING_TOOL_ID = new HashMap<>();
        DAYPARTING_TOOL_ID.put("id", ToolsHelper.DAYPARTING_TOOL_ID);
        DAYPARTING_TOOL_ID.put("name", "AI Advertising");
        DAYPARTING_TOOL_ID.put("descr", "Set AI-Powered Performance Goals for Your Products");
        DAYPARTING_TOOL_ID.put("section", "Research");
        DAYPARTING_TOOL_ID.put("svg-icon", "");
        DAYPARTING_TOOL_ID.put("svg-class", "");
        DAYPARTING_TOOL_ID.put("env", "prod");
        DAYPARTING_TOOL_ID.put("suffix", "uses");
        DAYPARTING_TOOL_ID.put("category", ToolsHelper.CATEGORY_ADVERTISING);
        DAYPARTING_TOOL_ID.put("showInNewSidebar", false);
        DAYPARTING_TOOL_ID.put("isNew", true);
        DAYPARTING_TOOL_ID.put("usesSpecialText", Collections.emptyList());
        tools.put(ToolsHelper.DAYPARTING_TOOL_ID, DAYPARTING_TOOL_ID);
    }};
}
