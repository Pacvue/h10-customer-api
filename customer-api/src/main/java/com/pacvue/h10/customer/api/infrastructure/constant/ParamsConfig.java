package com.pacvue.h10.customer.api.infrastructure.constant;

import com.pacvue.h10.customer.api.infrastructure.enums.ReplenishmentPeriodEnum;
import com.pacvue.h10.customer.api.infrastructure.helper.PlansHelper;
import com.pacvue.h10.customer.api.infrastructure.helper.ToolsHelper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParamsConfig {

//    public static Boolean areDownloadMobileAppBannersShown = false;
//    public static String adminEmail = "admin@example.com";
//    public static String supportEmail = "support@example.com";
//    public static Integer user_passwordResetTokenExpire = 3600;
//    public static String audittrail_table = "{{%AuditTrail}}";
//    public static List<String> allowedOrigins = new ArrayList<>();
//    public static Map<String, Map<String, Object>> plansOptions = new HashMap<>() {{
//        Map<String, Object> HELIUM10_FREE_PLAN = new HashMap<>();
//        HELIUM10_FREE_PLAN.put("interval", PlansHelper.PLANS_INTERVAL_MONTH);
//        HELIUM10_FREE_PLAN.put("intervalCount", PlansHelper.PLANS_INTERVAL_COUNT_1);
//        HELIUM10_FREE_PLAN.put("header", "FREE");
//        HELIUM10_FREE_PLAN.put("name", "Helium 10 Free");
//        HELIUM10_FREE_PLAN.put("defaultDescription", "getHelium10Taste");
//        HELIUM10_FREE_PLAN.put("type", "plan");
//        HELIUM10_FREE_PLAN.put("planId", PlansHelper.HELIUM10_FREE_PLAN);
//        HELIUM10_FREE_PLAN.put("image", "free_200.jpg");
//        HELIUM10_FREE_PLAN.put("free", true);
//        HELIUM10_FREE_PLAN.put("cssClass", "plan-free");
//        HELIUM10_FREE_PLAN.put("showSubscribersOnly", true);
//        Map<String, String> pricingChip = new HashMap<>();
//        pricingChip.put("color", "gray");
//        pricingChip.put("text", "chips.currentPlan");
//        HELIUM10_FREE_PLAN.put("pricingChip", pricingChip);
//        plansOptions.put(PlansHelper.HELIUM10_FREE_PLAN, HELIUM10_FREE_PLAN);
//    }};

    public static Map<String, Map<String, Object>> tools = new HashMap<>() {{
        Map<String, Object> AI_ADVERTISING_TOOL_ID = new HashMap<>() {{
            put("id", ToolsHelper.AI_ADVERTISING_TOOL_ID);
            put("name", "AI Advertising");
            put("descr", "Set AI-Powered Performance Goals for Your Products");
            put("section", "Research");
            put("svg-icon", "");
            put("svg-class", "");
            put("env", "prod");
            put("suffix", "uses");
            put("category", ToolsHelper.CATEGORY_ADVERTISING);
            put("showInNewSidebar", false);
            put("isNew", true);
            put("usesSpecialText", Collections.emptyList());
        }};
        put(ToolsHelper.AI_ADVERTISING_TOOL_ID, AI_ADVERTISING_TOOL_ID);

        Map<String, Object> DAYPARTING_TOOL_ID = new HashMap<>() {{
            put("id", ToolsHelper.DAYPARTING_TOOL_ID);
            put("name", "AI Advertising");
            put("descr", "Set AI-Powered Performance Goals for Your Products");
            put("section", "Research");
            put("svg-icon", "");
            put("svg-class", "");
            put("env", "prod");
            put("suffix", "uses");
            put("category", ToolsHelper.CATEGORY_ADVERTISING);
            put("showInNewSidebar", false);
            put("isNew", true);
            put("usesSpecialText", Collections.emptyList());
        }};
        put(ToolsHelper.DAYPARTING_TOOL_ID, DAYPARTING_TOOL_ID);

        Map<String, Object> AD_SPEND_LIMITS_TOOL_ID = new HashMap<>() {{
            put("id", ToolsHelper.AD_SPEND_LIMITS_TOOL_ID);
            put("name", "Ad Spend Limits");
            put("descr", "Pay only for managed ad spend that exceeds your plan's threshold");
            put("section", "Research");
            put("svg-icon", "");
            put("svg-class", "");
            put("env", "prod");
            put("suffix", "uses");
            put("category", ToolsHelper.CATEGORY_ADVERTISING);
            put("showInNewSidebar", false);
            put("isNew", false);
            List<String> helium10ScaleYourBusinessPlans = PlansHelper.HELIUM10_SCALE_YOUR_BUSINESS_PLANS;
            helium10ScaleYourBusinessPlans.add("<span>$5k/mo free | 2%</span>");
            put("usesSpecialText", helium10ScaleYourBusinessPlans);
            put("tooltipContent", "Spend up to $5k/mo at no extra cost. Then pay 2% of any managed ad spend exceeding $5k/mo");
        }};
        put(ToolsHelper.AD_SPEND_LIMITS_TOOL_ID, AD_SPEND_LIMITS_TOOL_ID);

        Map<String, Object> KEYWORD_RECOMMENDATIONS_TOOL_ID = new HashMap<>() {{
            put("id", ToolsHelper.KEYWORD_RECOMMENDATIONS_TOOL_ID);
            put("name", "Keyword Recommendations");
            put("descr", "Get rules-based suggestions with explanations for keyword and bid adjustments");
            put("section", "Research");
            put("svg-icon", "");
            put("svg-class", "");
            put("env", "prod");
            put("suffix", "uses");
            put("category", ToolsHelper.CATEGORY_ADVERTISING);
            put("showInNewSidebar", false);
            put("isNew", false);
            put("usesSpecialText", Collections.emptyList());
        }};
        put(ToolsHelper.KEYWORD_RECOMMENDATIONS_TOOL_ID, KEYWORD_RECOMMENDATIONS_TOOL_ID);

        Map<String, Object> RULE_BASED_AUTOMATION_TOOL_ID = new HashMap<>(){{
            put("id", ToolsHelper.RULE_BASED_AUTOMATION_TOOL_ID);
            put("name", "Rule-Based Automation");
            put("descr", "Create, Manage, and Automate Campaigns in Bulk");
            put("section", "Research");
            put("svg-icon", "");
            put("svg-class", "");
            put("env", "prod");
            put("suffix", "uses");
            put("category", ToolsHelper.CATEGORY_ADVERTISING);
            put("showInNewSidebar", false);
            put("isNew", false);
            put("usesSpecialText", Collections.emptyList());
        }};
        put(ToolsHelper.RULE_BASED_AUTOMATION_TOOL_ID, RULE_BASED_AUTOMATION_TOOL_ID);

        Map<String, Object> BLACKBOX_TOOL_ID = new HashMap<>(){{
            put("id", ToolsHelper.BLACKBOX_TOOL_ID);
            put("link", "/black-box/products");
            put("name", "Black Box");
            put("descr", "Amazon Product Research");
            put("section", "Research");
            put("icon", "font-icon menu-black-box");
            put("dashboard-icon", "/images/new-icons/Blackbox.png");
            put("icon-style", "");
            put("svg-icon", "/images/sidebar-icons/black-box.svg");
            put("svg-class", "icon_blackbox");
            put("env", "prod");
            put("suffix", "uses");
            put("replenishment-period", ReplenishmentPeriodEnum.daily.name());
            List<String> nonReplenishablePlans = new ArrayList<>(PlansHelper.HELIUM10_STARTER_PLANS);
            nonReplenishablePlans.add(PlansHelper.HELIUM10_FREE_PLAN);
            put("nonReplenishablePlans", nonReplenishablePlans);
            put("shareware", true);
            put("aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_BLACKBOX_39);
            put("aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_BLACKBOX_ANNUAL_390);
            put("legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_BLACKBOX);
            put("legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_BLACKBOX_ANNUAL);
            put("category", ToolsHelper.CATEGORY_PRODUCT_RESEARCH);
            put("showInNewSidebar", true);
            put("isNew", false);
            Map<String, List<String>> limited = new HashMap<>() {{
                put("Limited", nonReplenishablePlans);
            }};
            put("usesSpecialText", limited);
            put("tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/blackbox.png");
            put("tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/blackbox.png");
            put("tooltipTitle", "tooltip.pricing.blackBox");
        }};
        put(ToolsHelper.BLACKBOX_TOOL_ID, BLACKBOX_TOOL_ID);

        Map<String, Object> trendster = new HashMap<>() {{
            put("id", "trendster");
            put("link", "/trendster");
            put("name", "Trendster");
            put("descr", "Amazon Trends Finder");
            put("section", "Research");
            put("icon", "font-icon menu-trendster");
            put("dashboard-icon", "/images/new-icons/Trendster.png");
            put("icon-style", "font-size:18px;");
            put("svg-icon", "/images/sidebar-icons/trendster.svg");
            put("svg-class", "icon_trendster");
            put("env", "prod");
            put("suffix", "uses");
            put("free", true);
            put("category", ToolsHelper.CATEGORY_PRODUCT_RESEARCH);
            put("showInNewSidebar", true);
            put("isNew", false);
            put("isSunset", true);
        }};
        put("trendster", trendster);

        Map<String, Object> cerebro = new HashMap<>() {{
            put("id", "cerebro");
            put("link", "/cerebro");
            put("name", "Cerebro");
            put("descr", "Reverse Product Lookup");
            put("section", "Research");
            put("icon", "font-icon menu-cerebro");
            put("dashboard-icon", "/images/new-icons/Cerebro.png");
            put("icon-style", "font-size:21px;");
            put("svg-icon", "/images/sidebar-icons/cerebro.svg");
            put("svg-class", "icon_cerebro");
            put("env", "prod");
            put("suffix", "uses");
            put("replenishment-period", ReplenishmentPeriodEnum.daily.name());
            put("shareware", true);
            put("aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_CEREBRO_39);
            put("aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_CEREBRO_ANNUAL_390);
            put("legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_CEREBRO);
            put("legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_CEREBRO_ANNUAL);
            put("category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH);
            put("showInNewSidebar", true);
            put("isNew", false);
            put("tags", Collections.singleton("NEW WALMART BETA"));
            put("usesSpecialText", new HashMap<>().put("Limited",
                    Arrays.asList(PlansHelper.HELIUM10_STARTER_PLAN,
                            PlansHelper.HELIUM10_STARTER_39_PLAN,
                            PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN,
                            PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN)));
            put("tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/cerebro.png");
            put("tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/cerebro.png");
            put("tooltipTitle", "tooltip.pricing.cerebro");
        }};
        put("cerebro", cerebro);

        Map<String, Object> CEREBRO_WALMART_TOOL_ID = new HashMap<>() {{
            put("id", ToolsHelper.CEREBRO_WALMART_TOOL_ID);
            put("link", "/cerebro");
            put("name", "Cerebro for Walmart");
            put("descr", "Reverse Product Lookup");
            put("section", "Research");
            put("icon", "font-icon menu-cerebro");
            put("dashboard-icon", "/images/new-icons/Cerebro.png");
            put("icon-style", "font-size:21px;");
            put("svg-icon", "/images/sidebar-icons/cerebro.svg");
            put("svg-class", "icon_cerebro");
            put("env", "prod");
            put("suffix", "uses");
            put("replenishment-period", ReplenishmentPeriodEnum.daily.name());
            put("shareware", true);
            put("category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH);
            put("showInNewSidebar", false);
            put("showInPlanDetails", true);
            List<String> limited = new ArrayList<>(PlansHelper.HELIUM10_PLATINUM_PLANS);
            limited.add(PlansHelper.HELIUM10_STARTER_PLAN);
            limited.add(PlansHelper.HELIUM10_STARTER_39_PLAN);
            limited.add(PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN);
            limited.add(PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN);
            put("usesSpecialText", new HashMap<>().put("Limited", limited));
            put("tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/cerebro-for-walmart.png");
            put("tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/cerebro-for-walmart.png");
            put("tooltipTitle", "tooltip.pricing.cerebroForWalmart");
        }};
        put(ToolsHelper.CEREBRO_WALMART_TOOL_ID, CEREBRO_WALMART_TOOL_ID);

        Map<String, Object> cerebroAba = new HashMap<>() {{
            put("id", "cerebro-aba");
            put("link", "");
            put("name", "Cerebro ABA");
            put("descr", "Cerebro ABA");
            put("section", "Research");
            put("svg-icon", "");
            put("svg-class", "");
            put("env", "prod");
            put("suffix", "uses");
            put("replenishment-period", ReplenishmentPeriodEnum.daily.name());
            List<String> nonReplenishablePlans = new ArrayList<>(PlansHelper.HELIUM10_STARTER_PLANS);
            nonReplenishablePlans.add(PlansHelper.HELIUM10_FREE_PLAN);
            nonReplenishablePlans.addAll(PlansHelper.HELIUM10_PLATINUM_PLANS);
            put("nonReplenishablePlans", nonReplenishablePlans);
            put("showInSidebar", false);
            put("showInPlanDetails", false);
            put("showInNewSidebar", false);
        }};
        put("cerebro-aba", cerebroAba);

        Map<String, Object> cerebroHistorical = new HashMap<>() {{
            put("id", "cerebro-historical");
            put("link", "");
            put("name", "Cerebro Historical");
            put("descr", "Cerebro Historical");
            put("section", "Research");
            put("svg-icon", "");
            put("svg-class", "");
            put("env", "prod");
            put("suffix", "uses");
            put("replenishment-period", ReplenishmentPeriodEnum.daily.name());
            put("showInSidebar", false);
            put("showInPlanDetails", false);
            put("showInNewSidebar", false);
        }};
        put("cerebro-historical", cerebroHistorical);

        Map<String, Object> searchExpander = new HashMap<>() {{
            put("id", "search-expander");
            put("link", "");
            put("name", "Search Expander");
            put("descr", "Search Expander");
            put("section", "Research");
            put("svg-icon", "");
            put("svg-class", "");
            put("env", "prod");
            put("suffix", "uses");
            put("replenishment-period", ReplenishmentPeriodEnum.daily.name());
            put("nonReplenishablePlans", Stream.concat(
                    Stream.concat(Stream.of(PlansHelper.HELIUM10_FREE_PLAN), PlansHelper.HELIUM10_STARTER_PLANS.stream()),
                    PlansHelper.HELIUM10_A_LA_CARTE_PLANS.stream()
            ).collect(Collectors.toList()));
            put("showInSidebar", false);
            put("showInPlanDetails", false);
            put("showInNewSidebar", false);
        }};
        put("search-expander", searchExpander);

//        Map<String, Object> KEYWORD_TRACKER_TOOL_ID = new HashMap<>() {{
//                    put("id", ToolsHelper.KEYWORD_TRACKER_TOOL_ID);
//                    put("link", "/keyword-tracker-beta");
//                    put("name", "Keyword Tracker");
//                    put("descr", "Product Rank Tracking");
//                    put("section", "Account Health");
//                    put("icon", "font-icon menu-keyword-tracker");
//                    put("dashboard-icon", "/images/new-icons/Keyword-Tracker.png");
//                    put("icon-style", "font-size:15px;");
//                    put("svg-icon", "/images/sidebar-icons/keyword-tracker.svg");
//                    put("svg-class", "icon_keyword-tracker");
//                    put("env", "prod");
//                    put("suffix", "keywords");
//                    "remainingUses" , [KtController.class, "keywordsRemaining"],
//            "remainingUsesBatch" , [KtController.class, "keywordsAmazonRemainingBatch"],
//            "aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_KT_59,
//                    "aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_KT_ANNUAL_590,
//                    "legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_KT,
//                    "legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_KT_ANNUAL,
//                    "category", ToolsHelper.CATEGORY_ANALYTICS,
//                    "showInNewSidebar", true,
//                    "showOnMembersPricingPage", true,
//                    "isNew", false,
//                    "tags" , ["NEW WALMART BETA"],
//            "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/keyword-tracker.png",
//                    "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/keyword-tracker.png",
//                    "tooltipTitle" , [
//            "pricing", "addOn.Helium10_Keyword_Tracker_Addon.subTitle",
//            ],
//            "strategy", KeywordTrackerToolParametersStrategy.class,
//        }};
//        put(ToolsHelper.KEYWORD_TRACKER_TOOL_ID, KEYWORD_TRACKER_TOOL_ID);
//
//
//
//        ToolsHelper.KEYWORD_TRACKER_WALMART_TOOL_ID , [
//        "id", ToolsHelper.KEYWORD_TRACKER_WALMART_TOOL_ID,
//                "link", "/keyword-tracker?platform=walmart",
//                "name", "Keyword Tracker for Walmart",
//                "descr", "Product Rank Tracking",
//                "section", "Account Health",
//                "icon", "font-icon menu-keyword-tracker",
//                "dashboard-icon", "/images/new-icons/Keyword-Tracker.png",
//                "icon-style", "font-size:15px;",
//                "svg-icon", "/images/sidebar-icons/keyword-tracker.svg",
//                "svg-class", "icon_keyword-tracker",
//                "env", "prod",
//                "suffix", "keywords",
//                "remainingUses" , [KtController.class, "keywordsRemainingWalmart"],
//        "remainingUsesBatch" , [KtController.class, "keywordsWalmartRemainingBatch"],
//        "category", ToolsHelper.CATEGORY_ANALYTICS,
//                "showInNewSidebar", false,
//                "showInPlanDetails", true,
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/keyword-tracker-for-walmart.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/keyword-tracker-for-walmart.png",
//                "tooltipTitle", "tooltip.pricing.keywordTrackerForWalmart",
//        ],
//        "keywordresearch" , [
//        "id", "keywordresearch",
//                "link", "/magnet",
//                "name", "Magnet",
//                "descr", "Keyword Research",
//                "section", "Research",
//                "icon", "font-icon menu-magnet-2",
//                "dashboard-icon", "/images/new-icons/magnet.png",
//                "icon-style", "margin-right:-3px;",
//                "svg-icon", "/images/sidebar-icons/magnet-2.svg",
//                "svg-class", "icon_magnet",
//                "env", "prod",
//                "suffix", "uses",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "shareware", true,
//                "aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_MAGNET_39,
//                "aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_MAGNET_ANNUAL_390,
//                "legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_MAGNET,
//                "legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_MAGNET_ANNUAL,
//                "category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH,
//                "showInNewSidebar", true,
//                "tags" , ["NEW WALMART BETA"],
//        "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_STARTER_PLAN,
//                PlansHelper.HELIUM10_STARTER_39_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/magnet.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/magnet.png",
//                "tooltipTitle", "tooltip.pricing.magnet",
//        ],
//        ToolsHelper.MAGNET_WALMART_TOOL_ID , [
//        "id", ToolsHelper.MAGNET_WALMART_TOOL_ID,
//                "link", "/magnet2",
//                "name", "Magnet for Walmart",
//                "descr", "Keyword Research",
//                "section", "Research",
//                "icon", "font-icon menu-magnet-2",
//                "dashboard-icon", "/images/new-icons/magnet.png",
//                "icon-style", "margin-right:-3px;",
//                "svg-icon", "/images/sidebar-icons/magnet-2.svg",
//                "svg-class", "icon_magnet",
//                "env", "prod",
//                "suffix", "uses",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "shareware", true,
//                "category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH,
//                "showInNewSidebar", false,
//                "showInPlanDetails", true,
//                "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_STARTER_PLAN,
//                PlansHelper.HELIUM10_STARTER_39_PLAN,
//                PlansHelper.HELIUM10_PLATINUM_PLAN,
//                PlansHelper.HELIUM10_PLATINUM_99_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN,
//                PlansHelper.HELIUM10_PLATINUM_ANNUAL_PLAN,
//                PlansHelper.HELIUM10_PLATINUM_ANNUAL_999_PLAN,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/magnet-for-walmart.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/magnet-for-walmart.png",
//                "tooltipTitle", "tooltip.pricing.magnetForWalmart",
//        ],
//        ToolsHelper.XRAY_API_TOOL_ID , [
//        "id", ToolsHelper.XRAY_API_TOOL_ID,
//                "link", "",
//                "name", "XRay API",
//                "descr", "XRay API",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "uses",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "nonReplenishablePlans", array_merge(
//                [PlansHelper.HELIUM10_FREE_PLAN],
//                PlansHelper.HELIUM10_STARTER_PLANS
//            ),
//        "showInSidebar", false,
//                "showInPlanDetails", true,
//                "showInNewSidebar", false,
//                "env", "prod",
//                "category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH,
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/xray-keywords.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/xray-keywords.png",
//                "tooltipTitle", "tooltip.pricing.xrayKeywords",
//        ],
//        ToolsHelper.MARKET_TRACKER_TOOL_ID , [
//        "id", "markettracker",
//                "link", "/markettracker",
//                "name", "Market Tracker",
//                "descr", "Competitor Intelligence",
//                "icon", "font-icon menu-market-tracker",
//                "dashboard-icon", "/images/new-icons/Market-tracker2x.png",
//                "icon-style", "font-size:22px;",
//                "svg-icon", "/images/sidebar-icons/markettracker.svg",
//                "svg-class", "icon_market-tracker",
//                "env", "prod",
//                "suffix", "Markets",
//                "remainingUses" , [MarketTrackerController.class, "marketTrackerRemaining"],
//        "remainingUsesBatch" , [MarketTrackerController.class, "marketTrackerRemainingBatch"],
//        "showInSidebar", true,
//                "showInPlanDetails", true,
//                "category", ToolsHelper.CATEGORY_ANALYTICS,
//                "showInNewSidebar", true,
//                "isNew", false,
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/market-tracker.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/market-tracker.png",
//                "tooltipTitle", "tooltip.pricing.marketTracker",
//        ],
//        ToolsHelper.MT360_TOOL_ID , [
//        "id", ToolsHelper.MT360_TOOL_ID,
//                "link", "/mt360",
//                "name", "Market Tracker 360",
//                "descr", "New & Improved Competitor Intelligence",
//                "icon", "font-icon menu-market-tracker",
//                "dashboard-icon", "/images/new-icons/Market-tracker2x.png",
//                "icon-style", "font-size:22px;",
//                "svg-icon", "/images/sidebar-icons/markettracker.svg",
//                "svg-class", "icon_market-tracker",
//                "env", "prod",
//                "suffix", "Markets",
//                "showInPlanDetails", true,
//                "category", ToolsHelper.CATEGORY_ANALYTICS,
//                "showInNewSidebar", true,
//                "isNew", false,
//                "usesSpecialText" , [
//        "<span>Add-on <br> <b>Starting at $500/mo</b></span>" , [
//                    ...PlansHelper.HELIUM10_DIAMOND_PLANS,
//                    ...PlansHelper.HELIUM10_ELITE_PLANS,
//                    ...PlansHelper.HELIUM10_SCALE_YOUR_BUSINESS_PLANS,
//                ],
//        "5 free markets in Americas region", PlansHelper.HELIUM10_SUPERCHARGE_YOUR_BRAND_PLANS,
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/market-tracker-360.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/market-tracker-360.png",
//                "tooltipTitle", "tooltip.pricing.marketTracker360",
//                "strategy", Mt360ToolParametersStrategy.class,
//        ],
//        "misspellinator" , [
//        "id", "misspellinator",
//                "link", "/misspellinator",
//                "name", "Misspellinator",
//                "descr", "Misspellings Checker",
//                "section", "Research",
//                "icon", "font-icon menu-miss",
//                "dashboard-icon", "/images/new-icons/Misspellinator.png",
//                "icon-style", "",
//                "svg-icon", "/images/sidebar-icons/miss.svg",
//                "svg-class", "icon_misspellinator",
//                "env", "prod",
//                "suffix", "words",
//                "showInPlanDetails", true,
//                "category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH,
//                "showInNewSidebar", true,
//                "isSunset", true,
//        ],
//        ToolsHelper.FRANKENSTEIN_TOOL_ID , [
//        "id", ToolsHelper.FRANKENSTEIN_TOOL_ID,
//                "link", "/frankenstein",
//                "name", "Frankenstein",
//                "descr", "Keyword Processor",
//                "section", "Optimization",
//                "icon", "font-icon menu-frankenstain",
//                "dashboard-icon", "/images/new-icons/Frankenstain.png",
//                "icon-style", "font-size:19px;",
//                "svg-icon", "/images/sidebar-icons/frankenstain.svg",
//                "svg-class", "icon_frankenstein",
//                "env", "prod",
//                "suffix", "uses",
//                "free", true,
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInNewSidebar", true,
//                "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                PlansHelper.HELIUM10_STARTER_PLAN,
//                PlansHelper.HELIUM10_STARTER_39_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/frankenstein.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/frankenstein.png",
//                "tooltipTitle", "tooltip.pricing.frankenstein",
//        ],
//        "scribbles2" , [
//        "id", "scribbles2",
//                "link", "/scribbles",
//                "name", "Scribbles",
//                "descr", "Listing Optimizer",
//                "section", "Optimization",
//                "icon", "font-icon menu-scribbles",
//                "dashboard-icon", "/images/new-icons/Scribbles2.png",
//                "icon-style", "",
//                "svg-icon", "/images/sidebar-icons/scribbles.svg",
//                "svg-class", "icon_scribbles",
//                "env", "prod",
//                "suffix", "uses",
//                "free", true,
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInNewSidebar", true,
//                "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                PlansHelper.HELIUM10_STARTER_PLAN,
//                PlansHelper.HELIUM10_STARTER_39_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN,
//                ],
//            ],
//        ],
//        "ppc" , [
//        "id", "ppc",
//                "link", "https://adtomic.helium10.com/",
//                "absoluteLink", true,
//                "absoluteLinkWithAccountId", true,
//                "name", "Adtomic",
//                "descr", "Amazon Advertising Platform",
//                "svg-class", "icon_adtomic",
//                "suffix", "requests",
//                "env", "prod",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "category", ToolsHelper.CATEGORY_MARKETING,
//                "showInNewSidebar", true,
//                "isBeta", false,
//                "tags" , ["NEW WALMART BETA"],
//        "usesSpecialText" , [],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/adtomic.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/adtomic.png",
//                "tooltipTitle", "tooltip.pricing.adtomic",
//        ],
//        "amazon-attribution" , [
//        "id", "amazon-attribution",
//                "link", "https://portals.helium10.com/attributions",
//                "absoluteLink", true,
//                "absoluteLinkWithAccountId", true,
//                "name", "Amazon Attribution",
//                "descr", "Off-Amazon Advertising Analysis",
//                "icon", "",
//                "svg-icon", "/images/new-icons/icon_portals_attr.svg",
//                "svg-class", "icon_portals_attr",
//                "suffix", "pages",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "env", "prod",
//                "category", ToolsHelper.CATEGORY_MARKETING,
//                "showInNewSidebar", true,
//                "isNew", false,
//                "showToSubAccounts", true,
//                "strategy", AmazonAttributionToolParametersStrategy.class,
//        ],
//        "_5kchecker" , [
//        "id", "_5kchecker",
//                "link", "/5KChecker",
//                "name", "Index Checker",
//                "descr", "Keyword Index Checker",
//                "icon", "font-icon menu-index",
//                "dashboard-icon", "/images/new-icons/5K-Checker-new.png",
//                "icon-style", "font-size:18px;",
//                "svg-icon", "/images/sidebar-icons/index.svg",
//                "svg-class", "icon_index-checker",
//                "section", "Optimization",
//                "env", "prod",
//                "suffix", "uses",
//                "aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_IC_19,
//                "aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_IC_ANNUAL_190,
//                "legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_5KCHECKER,
//                "legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_5KCHECKER_ANNUAL,
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInNewSidebar", true,
//                "isSunset", true,
//        ],
//        "listing-hub" , [
//        "id", "listing-hub",
//                "link", "/LM",
//                "name", "Listing Hub",
//                "descr", "Listing Management",
//                "icon", "",
//                "svg-icon", "",
//                "svg-class", "",
//                "env", "prod",
//                "suffix", "",
//                "showInPlanDetails", false,
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "showInNewSidebar", false,
//                "isBeta", true,
//                "showToSubAccounts", true,
//                "strategy", ListingHubToolParametersStrategy.class,
//        ],
//        ToolsHelper.SMB_REFUND_SERVICE_TOOL_ID , [
//        "id", ToolsHelper.SMB_REFUND_SERVICE_TOOL_ID,
//                "link", "/managed-refund-service",
//                "name", "Managed Refund Service",
//                "descr", "Reclaim up to 1% of annual revenue",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "threshold",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "showInNewSidebar", false,
//                "showInAdminPanel", false,
//                "env", "prod",
//                "isNew", true,
//                "strategy", ManagedRefundServiceToolParametersStrategy.class,
//        ],
//        ToolsHelper.SMB_REFUND_SERVICE_ACCESS , [
//        "id", ToolsHelper.SMB_REFUND_SERVICE_ACCESS,
//                "link", "",
//                "name", "Managed Refund Service",
//                "descr", "FBA Refunds and Reimbursements",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "threshold",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//                "isNew", true,
//        ],
//        "alta" , [
//        "id", "alta",
//                "link", "/landing/growwithalta",
//                "name", "Alta by Helium 10",
//                "descr", "Financial Solutions",
//                "icon", "font-icon menu-alta",
//                "svg-icon", "/images/sidebar-icons/alta.svg",
//                "svg-class", "icon_alta",
//                "sidebarSpanTextStyle", "color:#0395ff; font-weight: bold;",
//                "env", "prod",
//                "suffix", "requests",
//                "showInPlanDetails", false,
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "showInNewSidebar", true,
//                "showToSubAccounts", true,
//                "isSunset", true,
//        ],
//        "refersion" , [
//        "id", "refersion",
//                "link", "https://www.refersion.com/landing/amazon-affiliate-marketing-h10?utm_source=H10&utm_medium=in-app&utm_content=Tools-Menu&campaign=AmazonLaunch",
//                "target", UrlOptions.TARGET_BLANK,
//                "name", "Refersion",
//                "descr", "Affiliates for your Amazon Store",
//                "icon", "",
//                "svg-icon", "",
//                "svg-class", "",
//                "sidebarSpanTextStyle", "color:#0395ff; font-weight: bold;",
//                "env", "prod",
//                "suffix", "requests",
//                "showInPlanDetails", false,
//                "category", ToolsHelper.CATEGORY_PARTNER,
//                "showInNewSidebar", true,
//                "strategy", RefersionToolParametersStrategy.class,
//        ],
//        ToolsHelper.ALERTS_TOOL_ID , [
//        "id", ToolsHelper.ALERTS_TOOL_ID,
//                "link", "/alerts",
//                "name", "Alerts",
//                "descr", "Hijacker & Product Monitoring",
//                "section", "Account Health",
//                "icon", "font-icon menu-alert",
//                "dashboard-icon", "/images/new-icons/Alerts.png",
//                "icon-style", "font-size:18px;",
//                "svg-icon", "/images/sidebar-icons/alert.svg",
//                "svg-class", "icon_alert",
//                "env", "prod",
//                "suffix", "ASINS",
//                "remainingUses" , ["\customer\modules\alerts\models\AlProduct", "asinsRemaining"],
//        "remainingUsesBatch" , ["\customer\modules\alerts\models\AlProduct", "asinsRemainingBatch"],
//        "aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_ALERTS_39,
//                "aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_ALERTS_ANNUAL_390,
//                "legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_HJA,
//                "legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_HJA_ANNUAL,
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "showInNewSidebar", true,
//                "isNew", false,
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/alerts.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/alerts.png",
//                "tooltipTitle", "tooltip.pricing.alerts",
//        ],
//        "inventoryprotector" , [
//        "id", "inventoryprotector",
//                "link", "/inventory-protector",
//                "name", "Inventory Protector",
//                "descr", "Coupon Abuse Prevention",
//                "section", "Account Health",
//                "icon", "font-icon menu-inventory",
//                "dashboard-icon", "/images/new-icons/Inventory-Protector.png",
//                "icon-style", "",
//                "svg-icon", "/images/sidebar-icons/inventory.svg",
//                "svg-class", "icon_inventory",
//                "env", "prod",
//                "suffix", "uses",
//                "free", true,
//                "hide", false,
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "showInNewSidebar", true,
//                "isSunset", true,
//        ],
//        "refundgenie" , [
//        "id", "refundgenie",
//                "link", "/refundgenie/main/index",
//                "name", "Refund Genie",
//                "descr", "Reimbursement Assistance",
//                "section", "Account Health",
//                "icon", "font-icon menu-refund",
//                "dashboard-icon", "/images/new-icons/Refund-Genie.png",
//                "icon-style", "font-size:16px;",
//                "svg-icon", "/images/sidebar-icons/refund.svg",
//                "svg-class", "icon_refund",
//                "env", "prod",
//                "suffix", "uses",
//                "aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_RG_99,
//                "aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_RG_ANNUAL_990,
//                "legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_RG,
//                "legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_RG_ANNUAL,
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "showInNewSidebar", true,
//                "strategy", RefundGenieToolParametersStrategy.class,
//        ],
//        "xray" , [
//        "id", "xray",
//                "link", "/xray",
//                "name", "Xray",
//                "descr", "Chrome Extension - Product Validator",
//                "icon", "/images/new-icons/Xray.png",
//                "svg-icon", "/images/sidebar-icons/xray.svg",
//                "svg-class", "icon_xray",
//                "env", "prod",
//                "suffix", "requests",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "nonReplenishablePlans" , [PlansHelper.HELIUM10_FREE_PLAN],
//        "showInSidebar", false,
//                "showInPlanDetails", true,
//                "strikePrice", 99,
//                "aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_XRAY_19,
//                "aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_XRAY_ANNUAL_190,
//                "legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_XRAY,
//                "legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_XRAY_ANNUAL,
//                "category", ToolsHelper.CATEGORY_PRODUCT_RESEARCH,
//                "showInNewSidebar", false,
//                "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                ],
//        "<i class=" far fa -check " aria-hidden=" "></i>" , [
//        PlansHelper.HELIUM10_STARTER_PLAN,
//                PlansHelper.HELIUM10_STARTER_39_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN,
//                PlansHelper.HELIUM10_EXPLORER_CN,
//                PlansHelper.HELIUM10_EXPLORER_CN_ANNUAL,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/xray.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/xray.png",
//                "tooltipTitle", "tooltip.pricing.xray",
//        ],
//        ToolsHelper.XRAY_WALMART_TOOL_ID , [
//        "id", ToolsHelper.XRAY_WALMART_TOOL_ID,
//                "link", "/xray",
//                "name", "Xray for Walmart",
//                "descr", "Chrome Extension - Product Validator",
//                "icon", "/images/new-icons/Xray.png",
//                "svg-icon", "/images/sidebar-icons/xray.svg",
//                "svg-class", "icon_xray",
//                "env", "prod",
//                "suffix", "requests",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "nonReplenishablePlans" , [PlansHelper.HELIUM10_FREE_PLAN],
//        "showInSidebar", false,
//                "showInPlanDetails", true,
//                "category", ToolsHelper.CATEGORY_PRODUCT_RESEARCH,
//                "showInNewSidebar", false,
//                "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                    ...PlansHelper.HELIUM10_STARTER_PLANS,
//                    ...PlansHelper.HELIUM10_START_YOUR_BUSINESS_PLANS,
//                    ...PlansHelper.HELIUM10_PLATINUM_ONLY_PLANS,
//                    ...PlansHelper.HELIUM10_ENTREPRENEUR_PLANS,
//                    ...PlansHelper.HELIUM10_EXPLORER_PLANS,
//                ],
//        InvocationLimits.getToolPlanLimit("xray-walmart", PlansHelper.HELIUM10_EXPLORER_CN)." launches" , [
//        PlansHelper.HELIUM10_EXPLORER_CN],
//        InvocationLimits.getToolPlanLimit("xray-walmart", PlansHelper.HELIUM10_EXPLORER_CN_ANNUAL)." launches" , [
//        PlansHelper.HELIUM10_EXPLORER_CN_ANNUAL],
//        InvocationLimits.getToolPlanLimit("xray-walmart", PlansHelper.HELIUM10_START_YOUR_BUSINESS_PLAN)." launches" , [
//        PlansHelper.HELIUM10_START_YOUR_BUSINESS_PLAN],
//        InvocationLimits.getToolPlanLimit("xray-walmart", PlansHelper.HELIUM10_START_YOUR_BUSINESS_ANNUAL_PLAN)." launches" , [
//        PlansHelper.HELIUM10_START_YOUR_BUSINESS_ANNUAL_PLAN],
//        InvocationLimits.getToolPlanLimit("xray-walmart", PlansHelper.HELIUM10_ENTREPRENEUR_CN)." launches" , [
//        PlansHelper.HELIUM10_ENTREPRENEUR_CN],
//        InvocationLimits.getToolPlanLimit("xray-walmart", PlansHelper.HELIUM10_ENTREPRENEUR_CN_ANNUAL)." launches" , [
//        PlansHelper.HELIUM10_ENTREPRENEUR_CN_ANNUAL],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/xray-for-walmart.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/xray-for-walmart.png",
//                "tooltipTitle", "tooltip.pricing.xrayForWalmart",
//        ],
//        ToolsHelper.REVIEW_INSIGHTS_TOOL_ID , [
//        "id", ToolsHelper.REVIEW_INSIGHTS_TOOL_ID,
//                "link", "",
//                "name", "Review Insights",
//                "descr", "Review Insights",
//                "icon", "",
//                "svg-icon", "",
//                "svg-class", "",
//                "env", "prod",
//                "suffix", "uses",
//                "showInPlanDetails", true,
//                "category", ToolsHelper.CATEGORY_PRODUCT_RESEARCH,
//                "showInNewSidebar", false,
//                "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/review-insights.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/review-insights.png",
//                "tooltipTitle", "tooltip.pricing.reviewInsights",
//        ],
//        ToolsHelper.PROFITS_TOOL_ID , [
//        "id", ToolsHelper.PROFITS_TOOL_ID,
//                "link", "/profits",
//                "name", "Profits",
//                "descr", "Financial Analytics Dashboard",
//                "svg-class", "icon_profits",
//                "env", "prod",
//                "suffix", "days",
//                "aLaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_PROFITS_39,
//                "aLaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_PROFITS_ANNUAL_390,
//                "legacyALaCartePlanId", PlansHelper.HELIUM10_A_LA_CARTE_PROFITS,
//                "legacyALaCarteAnnualPlanId", PlansHelper.HELIUM10_A_LA_CARTE_PROFITS_ANNUAL,
//                "category", ToolsHelper.CATEGORY_ANALYTICS,
//                "showInSidebar", false,
//                "showInNewSidebar", true,
//                "showInPlanDetails", true,
//                "tags" , ["NEW WALMART BETA"],
//        "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN
//                ]
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/profits.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/profits.png",
//                "tooltipTitle", "tooltip.pricing.profits",
//        ],
//        ToolsHelper.PROFITS_WALMART_TOOL_ID , [
//        "id", ToolsHelper.PROFITS_WALMART_TOOL_ID,
//                "link", "/profits",
//                "name", "Profits for Walmart",
//                "descr", "Financial Analytics Dashboard",
//                "svg-class", "icon_profits",
//                "env", "prod",
//                "suffix", "days",
//                "category", ToolsHelper.CATEGORY_ANALYTICS,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showInPlanDetails", true,
//                "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                    ...PlansHelper.HELIUM10_STARTER_PLANS,
//                    ...PlansHelper.HELIUM10_PLATINUM_PLANS,
//                    ...PlansHelper.HELIUM10_START_YOUR_BUSINESS_PLANS
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/profits-for-walmart.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/profits-for-walmart.png",
//                "tooltipTitle", "tooltip.pricing.profitsForWalmart",
//        ],
//        ToolsHelper.FOLLOW_UP_TOOL_ID , [
//        "id", ToolsHelper.FOLLOW_UP_TOOL_ID,
//                "link", "https://followup.helium10.com/",
//                "absoluteLink", true,
//                "absoluteLinkWithAccountId", true,
//                "name", "Follow-Up",
//                "descr", "Email Automation Tool",
//                "icon", "/images/new-icons/Followup.png",
//                "svg-icon", "/images/sidebar-icons/follow-up.svg",
//                "svg-class", "icon_follow-up",
//                "suffix", "emails",
//                "showLimits", true,
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "env", "prod",
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "showInNewSidebar", true,
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/follow-up.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/follow-up.png",
//                "tooltipTitle", "tooltip.pricing.followUp",
//        ],
//        "portals" , [
//        "id", "portals",
//                "link", "https://portals.helium10.com/",
//                "absoluteLink", true,
//                "absoluteLinkWithAccountId", true,
//                "name", "Portals",
//                "descr", "Landing Page Builder",
//                "icon", "/images/new-icons/Portals2x.png",
//                "svg-icon", "/images/sidebar-icons/portals.svg",
//                "svg-class", "icon_portals",
//                "suffix", "pages",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "env", "prod",
//                "category", ToolsHelper.CATEGORY_MARKETING,
//                "showInNewSidebar", true,
//                "isNew", false,
//                "isSunset", true,
//        ],
//        "lp-builder-portals" , [
//        "id", "lp-builder-portals",
//                "link", "https://portals.helium10.com/",
//                "absoluteLink", true,
//                "absoluteLinkWithAccountId", true,
//                "name", "Landing Page Builder, Portals",
//                "descr", "",
//                "icon", "/images/new-icons/Portals2x.png",
//                "svg-icon", "/images/sidebar-icons/portals.svg",
//                "svg-class", "icon_portals",
//                "suffix", "pages",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "env", "prod",
//                "category", ToolsHelper.CATEGORY_MARKETING,
//                "showInNewSidebar", false,
//        ],
//        "qr-codes-portals" , [
//        "id", "qr-codes-portals",
//                "link", "https://portals.helium10.com/",
//                "absoluteLink", true,
//                "absoluteLinkWithAccountId", true,
//                "name", "QR Codes, Portals",
//                "descr", "",
//                "icon", "/images/new-icons/Portals2x.png",
//                "svg-icon", "/images/sidebar-icons/portals.svg",
//                "svg-class", "icon_portals",
//                "suffix", "pages",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "env", "prod",
//                "category", ToolsHelper.CATEGORY_MARKETING,
//                "showInNewSidebar", false,
//                "showLimits", true,
//        ],
//        "product-inserts-portals" , [
//        "id", "product-inserts-portals",
//                "link", "https://portals.helium10.com/",
//                "absoluteLink", true,
//                "absoluteLinkWithAccountId", true,
//                "name", "Product Inserts, Portals",
//                "descr", "",
//                "icon", "/images/new-icons/Portals2x.png",
//                "svg-icon", "/images/sidebar-icons/portals.svg",
//                "svg-class", "icon_portals",
//                "suffix", "pages",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "env", "prod",
//                "category", ToolsHelper.CATEGORY_MARKETING,
//                "showInNewSidebar", false,
//                "showLimits", false,
//        ],
//        ToolsHelper.USER_ACCOUNTS_TOOL_ID , [
//        "id", ToolsHelper.USER_ACCOUNTS_TOOL_ID,
//                "link", "/user-accounts",
//                "name", "Multi-User Login",
//                "descr", "Create Limited Access Users",
//                "icon", "/images/new-icons/Multi-User-Login.png",
//                "svg-icon", "/images/sidebar-icons/multi-user.svg",
//                "svg-class", "icon_multi-user",
//                "env", "prod",
//                "suffix", "users",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "remainingUses" , [UserAccountsController.class, "usersRemaining"],
//        "remainingUsesBatch" , [UserAccountsController.class, "usersRemainingBatch"],
//        "showInNewSidebar", false,
//                "category", ToolsHelper.CATEGORY_ADDITIONAL_PERKS,
//        ],
//        ToolsHelper.MWS_TOKENS_TOOL_ID , [
//        "id", ToolsHelper.MWS_TOKENS_TOOL_ID,
//                "link", "/account/tokens-manager",
//                "name", "Connected Accounts",
//                "descr", "Seller Central Account Connections",
//                "icon", "far fa-id-card",
//                "svg-icon", "/images/sidebar-icons/accounts.svg",
//                "svg-class", "icon_accounts",
//                "env", "prod",
//                "suffix", "accounts",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "remainingUses" , [ConnectionsController.class, "connectsRemaining"],
//        "remainingUsesBatch" , [ConnectionsController.class, "connectsRemainingBatch"],
//        "showInNewSidebar", false,
//                "category", ToolsHelper.CATEGORY_ADDITIONAL_PERKS,
//        ],
//        ToolsHelper.FREEDOM_TICKET_4_TOOL_ID , [
//        "id", ToolsHelper.FREEDOM_TICKET_4_TOOL_ID,
//                "link", "/freedom-ticket/index",
//                "target", UrlOptions.TARGET_BLANK,
//                "name", "Freedom Ticket",
//                "descr", "Award-winning training series",
//                "icon", "/images/new-icons/Freedom-Ticket-Training.png",
//                "svg-icon", "/images/sidebar-icons/freedom-ticket.svg",
//                "svg-class", "icon_freedom-ticket",
//                "category", ToolsHelper.CATEGORY_LEARNING,
//                "suffix", "pages",
//                "showInNewSidebar", false,
//                "showInPlanDetails", false,
//                "showOnMembersPricingPage", false,
//                "env", "prod",
//                "showToSubAccounts", true,
//                "strategy", FreedomTicket4ToolParametersStrategy.class,
//        ],
//        ToolsHelper.FREEDOM_TICKET_TOOL_ID , [
//        "id", ToolsHelper.FREEDOM_TICKET_TOOL_ID,
//                "link", "/freedom-ticket/index",
//                "target", UrlOptions.TARGET_BLANK,
//                "name", "Learning Hub",
//                "descr", "Amazon Sellers Training",
//                "icon", "/images/new-icons/Freedom-Ticket-Training.png",
//                "svg-icon", "/images/sidebar-icons/freedom-ticket.svg",
//                "svg-class", "icon_freedom-ticket",
//                "category", ToolsHelper.CATEGORY_LEARNING,
//                "suffix", "pages",
//                "showInNewSidebar", true,
//                "showInPlanDetails", true,
//                "env", "prod",
//                "showToSubAccounts", true,
//                "strategy", FreedomTicketToolParametersStrategy.class,
//        ],
//        ToolsHelper.AMAZON_PPC_ACADEMY_TOOL_ID , [
//        "id", ToolsHelper.AMAZON_PPC_ACADEMY_TOOL_ID,
//                "link", "/freedom-ticket/index",
//                "target", UrlOptions.TARGET_BLANK,
//                "name", "Amazon PPC Academy",
//                "descr", "Intermediate-to-Advanced PPC Training",
//                "icon", "/images/new-icons/Freedom-Ticket-Training.png",
//                "svg-icon", "/images/sidebar-icons/freedom-ticket.svg",
//                "svg-class", "icon_freedom-ticket",
//                "category", ToolsHelper.CATEGORY_LEARNING,
//                "suffix", "pages",
//                "showInPlanDetails", true,
//                "showInNewSidebar", false,
//                "env", "prod",
//                "isNew", false,
//                "showToSubAccounts", true,
//                "strategy", AmazonPpcAcademyToolParametersStrategy.class,
//        ],
//        ToolsHelper.EXIT_TICKET_TOOL_ID , [
//        "id", ToolsHelper.EXIT_TICKET_TOOL_ID,
//                "link", "/freedom-ticket/index",
//                "target", UrlOptions.TARGET_BLANK,
//                "name", "Exit Ticket",
//                "descr", "E-Commerce Business Exit Strategy",
//                "icon", "/images/new-icons/Freedom-Ticket-Training.png",
//                "svg-icon", "/images/sidebar-icons/freedom-ticket.svg",
//                "svg-class", "icon_freedom-ticket",
//                "category", ToolsHelper.CATEGORY_LEARNING,
//                "suffix", "pages",
//                "showInPlanDetails", true,
//                "showInNewSidebar", false,
//                "env", "prod",
//                "isNew", false,
//                "showToSubAccounts", true,
//                "strategy", ExitTicketToolParametersStrategy.class,
//        ],
//        ToolsHelper.KEYWORD_MANAGER_TOOL_ID , [
//        "id", ToolsHelper.KEYWORD_MANAGER_TOOL_ID,
//                "link", "/keyword-manager/my-list",
//                "target", UrlOptions.TARGET_BLANK,
//                "name", "My List - Keywords",
//                "descr", "Save your keywords",
//                "category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH,
//                "svg-icon", "/images/sidebar-icons/keyword-manager.svg",
//                "svg-class", "icon_my-list",
//                "suffix", "folders",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        ToolsHelper.BLACKBOX_MY_LIST_TOOL_ID , [
//        "id", ToolsHelper.BLACKBOX_MY_LIST_TOOL_ID,
//                "link", "/black-box/my-list",
//                "target", UrlOptions.TARGET_BLANK,
//                "name", "My List - Products",
//                "descr", "Save your product ideas",
//                "suffix", "folders",
//                "svg-class", "icon_my-list",
//                "category", ToolsHelper.CATEGORY_PRODUCT_RESEARCH,
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        ToolsHelper.INVENTORY_MANAGEMENT_TOOL_ID , [
//        "id", "inventory-management",
//                "link", "/inventory-management",
//                "name", "Inventory Management",
//                "descr", "Supply Chain Logistics",
//                "svg-class", "icon_inventory-management",
//                "env", "prod",
//                "suffix", "SKU",
//                "showInPlanDetails", true,
//                "showInNewSidebar", true,
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                    ...PlansHelper.HELIUM10_STARTER_PLANS,
//                ]
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/inventory-management.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/inventory-management.png",
//                "tooltipTitle", "tooltip.pricing.inventoryManagement",
//        ],
//        ToolsHelper.BUSINESS_VALUATION_TOOL_ID , [
//        "id", ToolsHelper.BUSINESS_VALUATION_TOOL_ID,
//                "link", "/business-valuation",
//                "name", "Business Valuation",
//                "descr", "Estimated Brand Value",
//                "env", "prod",
//                "suffix", "uses",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "showInNewSidebar", false,
//                "category", ToolsHelper.CATEGORY_OPERATIONS,
//                "isNew", false,
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/business-valuation.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/business-valuation.png",
//                "tooltipTitle", "tooltip.pricing.businessValuation",
//                "strategy", BusinessValuationToolParametersStrategy.class,
//        ],
//        "keywordresearch-widget" , [
//        "id", "keywordresearch-widget",
//                "link", "/",
//                "name", "Keyword Research Widget",
//                "descr", "Keyword Research Widget",
//                "suffix", "uses",
//                "svg-icon", "/images/sidebar-icons/keyword-research.svg",
//                "svg-class", "icon_keyword-research",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        "reverse-search-api" , [
//        "id", "reverse-search-api",
//                "link", "/",
//                "name", "Reverse Search API",
//                "descr", "Reverse Search API",
//                "svg-icon", "/images/sidebar-icons/cerebro.svg",
//                "svg-class", "icon_cerebro",
//                "suffix", "uses",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        "pinterest-widget" , [
//        "id", "pinterest-widget",
//                "link", "/",
//                "name", "Pinterest Widget",
//                "descr", "Pinterest Widget",
//                "suffix", "uses",
//                "svg-icon", "/images/sidebar-icons/keyword-research.svg",
//                "svg-class", "icon_keyword-research",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        "alibaba-demand-analyzer" , [
//        "id", "alibaba-demand-analyzer",
//                "link", "/",
//                "name", "Alibaba Demand Analyzer",
//                "descr", "Alibaba Demand Analyzer",
//                "svg-icon", "/images/sidebar-icons/keyword-research.svg",
//                "svg-class", "icon_keyword-research",
//                "env", "prod",
//                "suffix", "uses",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "nonReplenishablePlans" , [PlansHelper.HELIUM10_FREE_PLAN],
//        "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//        ],
//        ToolsHelper.LISTING_ANALYZER_TOOL_ID , [
//        "id", ToolsHelper.LISTING_ANALYZER_TOOL_ID,
//                "link", "/listing-analyzer",
//                "name", "Listing Analyzer",
//                "descr", "Amazon Listing Insights",
//                "section", "Optimization",
//                "icon", "font-icon menu-cerebro",
//                "dashboard-icon", "/images/new-icons/listing-analyzer.png",
//                "icon-style", "font-size:21px;",
//                "svg-icon", "/images/sidebar-icons/listing-analyzer.svg",
//                "svg-class", "icon_listing-analyzer",
//                "env", "prod",
//                "suffix", "uses",
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInNewSidebar", true,
//                "isNew", false,
//                "showLimits", true,
//                "showInPlanDetails", true,
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/listing-analyzer.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/listing-analyzer.png",
//                "tooltipTitle", "tooltip.pricing.listingAnalyzer",
//        ],
//        ToolsHelper.LISTING_BUILDER_TOOL_ID , [
//        "id", ToolsHelper.LISTING_BUILDER_TOOL_ID,
//                "link", "/listing-builder",
//                "name", "Listing Builder",
//                "descr", "listingBuilderToolDescription",
//                "icon", "font-icon menu-cerebro",
//                "dashboard-icon", "/images/new-icons/listing-analyzer.png",
//                "icon-style", "font-size:21px;",
//                "svg-icon", "/images/sidebar-icons/listing-analyzer.svg",
//                "svg-class", "icon_listing-analyzer",
//                "env", "prod",
//                "suffix", "listings",
//                "showInPlanDetails", true,
//                "showLimits", true,
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "isNew", false,
//                "isBeta", false,
//                "usesSpecialText" , [
//        "30 days, limited" , [
//        PlansHelper.HELIUM10_EXPLORER_CN,
//                PlansHelper.HELIUM10_EXPLORER_CN_ANNUAL,
//                ],
//        "Limited" , [
//        PlansHelper.HELIUM10_STARTER_PLAN,
//                PlansHelper.HELIUM10_STARTER_39_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN,
//                PlansHelper.HELIUM10_FREE_PLAN,
//                PlansHelper.HELIUM10_GOLD_PLAN,
//
//                PlansHelper.HELIUM10_ENTREPRENEUR_CN,
//                PlansHelper.HELIUM10_ENTREPRENEUR_CN_ANNUAL,
//                ],
//        "Limited (No Amazon Sync)" , [
//                    ...PlansHelper.HELIUM10_START_YOUR_BUSINESS_PLANS,
//                ],
//        "<i class=" far fa -check " aria-hidden=" "></i>" , [
//                    ...PlansHelper.HELIUM10_SUPERCHARGE_YOUR_BRAND_PLANS,
//                    ...PlansHelper.HELIUM10_ELITE_PLANS,
//                    ...PlansHelper.HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLES,
//                    ...PlansHelper.HELIUM10_SCALE_YOUR_BUSINESS_PLANS,
//                    ...PlansHelper.HELIUM10_DIAMOND_ONLY_PLANS,
//                    ...PlansHelper.HELIUM10_PLATINUM_ONLY_PLANS,
//                PlansHelper.HELIUM10_PROFESSIONAL_CN,
//                PlansHelper.HELIUM10_PROFESSIONAL_CN_ANNUAL,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/listing-builder.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/listing-builder.png",
//                "tooltipTitle", "tooltip.pricing.listingBuilder",
//                "strategy", ListingBuilderToolParametersStrategy.class,
//        ],
//        ToolsHelper.LISTING_BUILDER_GENERATOR , [
//        "id", ToolsHelper.LISTING_BUILDER_GENERATOR,
//                "link", "/listing-builder",
//                "icon", "font-icon menu-cerebro",
//                "dashboard-icon", "/images/new-icons/listing-analyzer.png",
//                "icon-style", "font-size:21px;",
//                "svg-icon", "/images/sidebar-icons/listing-analyzer.svg",
//                "svg-class", "icon_listing-analyzer",
//                "name", "Listing Builder",
//                "descr", "AI-Powered Listing Optimizer",
//                "suffix", "listings",
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInSidebar", true,
//                "showInNewSidebar", true,
//                "showOnMembersPricingPage", false,
//                "showInPlanDetails", false,
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "env", "prod",
//                "tags" , ["AI"],
//        ],
//        ToolsHelper.LISTING_BUILDER_LISTINGS , [
//        "id", ToolsHelper.LISTING_BUILDER_LISTINGS,
//                "link", "",
//                "name", "Listing Builder Listings",
//                "descr", "Listing Builder Listings",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "listings",
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showInPlanDetails", false,
//                "env", "prod",
//                "remainingUses" , [ListingBuilderListings.class, "getListingsCount"],
//        "remainingUsesBatch" , [ListingBuilderListings.class, "getListingsCountBatch"],
//        ],
//        ToolsHelper.LISTING_BUILDER_VERSIONS , [
//        "id", ToolsHelper.LISTING_BUILDER_VERSIONS,
//                "link", "",
//                "name", "Listing Builder Versions",
//                "descr", "Listing Builder Versions",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "versions",
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showInPlanDetails", false,
//                "env", "prod",
//        ],
//        ToolsHelper.LISTING_BUILDER_COMPETITORS , [
//        "id", ToolsHelper.LISTING_BUILDER_COMPETITORS,
//                "link", "",
//                "name", "Listing Builder Competitors",
//                "descr", "Listing Builder Competitors",
//                "suffix", "ASINS",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        ToolsHelper.LISTING_BUILDER_IMAGE_AI , [
//        "id", ToolsHelper.LISTING_BUILDER_IMAGE_AI,
//                "link", "",
//                "name", "Listing Builder AI Image generator",
//                "descr", "Listing Builder AI Image generator",
//                "suffix", "uses",
//                "nonReplenishablePlans", PlansHelper.HELIUM10_PLATINUM_LIKE_PLANS,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showInPlanDetails", false,
//                "showOnMembersPricingPage", false,
//                "env", "prod",
//        ],
//        "audience" , [
//        "id", "audience",
//                "link", "/audience",
//                "name", "Audience",
//                "descr", "Market Feedback",
//                "section", "Optimization",
//                "icon", "font-icon menu-audience",
//                "svg-icon", "/images/sidebar-icons/menu-audience.svg",
//                "svg-class", "icon_audience",
//                "sidebarSpanTextStyle", "color:#0395ff; font-weight: bold;",
//                "env", "prod",
//                "suffix", "requests",
//                "showInPlanDetails", false,
//                "category", ToolsHelper.CATEGORY_LISTING_OPTIMIZATION,
//                "showInNewSidebar", true,
//                "isNew", false,
//                "isSunset", true,
//        ],
//        "monthly-expert-training" , [
//        "id", "monthly-expert-training",
//                "link", "",
//                "name", "Monthly Expert Training",
//                "descr", "Learn from Top Industry Experts",
//                "icon", "",
//                "svg-icon", "",
//                "svg-class", "",
//                "env", "prod",
//                "suffix", "trainings",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "showInNewSidebar", false,
//                "showLimits", true,
//                "category", ToolsHelper.CATEGORY_ADDITIONAL_PERKS,
//                "usesSpecialText" , [
//        "<span>Add-on <br> <b>Starting at ${price}/mo</b></span>", PlansHelper.HELIUM10_SCALE_YOUR_BUSINESS_PLANS,
//            ],
//        "strategy" , [
//        MonthlyExpertTrainingToolParametersStrategy.class,
//                SpecialTextPricePlaceholderReplacementStrategy.class,
//            ],
//        ],
//        "in-person-workshops" , [
//        "id", "in-person-workshops",
//                "link", "",
//                "name", "In-Person Workshops",
//                "descr", "High-Level Knowledge Networking",
//                "icon", "",
//                "svg-icon", "",
//                "svg-class", "",
//                "env", "prod",
//                "suffix", "trainings",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "showInNewSidebar", false,
//                "showLimits", true,
//                "category", ToolsHelper.CATEGORY_ADDITIONAL_PERKS,
//                "usesSpecialText" , [
//        "<span>Add-on <br> <b>Starting at ${price}/mo</b></span>", PlansHelper.HELIUM10_SCALE_YOUR_BUSINESS_PLANS,
//            ],
//        "strategy" , [
//        InPersonWorkshopsToolParametersStrategy.class,
//                SpecialTextPricePlaceholderReplacementStrategy.class,
//            ],
//        ],
//        "private-facebook-group" , [
//        "id", "private-facebook-group",
//                "link", "",
//                "name", "Private Facebook Group",
//                "descr", "Membership-Exclusive Access",
//                "icon", "",
//                "svg-icon", "",
//                "svg-class", "",
//                "env", "prod",
//                "suffix", "trainings",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "showInNewSidebar", false,
//                "showLimits", true,
//                "category", ToolsHelper.CATEGORY_ADDITIONAL_PERKS,
//                "usesSpecialText" , [
//        "<span>Add-on <br> <b>Starting at ${price}/mo</b></span>", PlansHelper.HELIUM10_SCALE_YOUR_BUSINESS_PLANS,
//            ],
//        "strategy" , [
//        PrivateFacebookGroupToolParametersStrategy.class,
//                SpecialTextPricePlaceholderReplacementStrategy.class,
//            ],
//        ],
//        "mobile-product-search" , [
//        "id", "mobile-product-search",
//                "link", "",
//                "name", "Mobile Product Search API",
//                "descr", "Mobile Product Search API",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "uses",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//        ],
//        "mobile-keyword-search" , [
//        "id", "mobile-keyword-search",
//                "link", "",
//                "name", "Mobile Keyword Search API",
//                "descr", "Mobile Keyword Search API",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "uses",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//        ],
//        "opportunity-finder" , [
//        "id", "opportunity-finder",
//                "link", "",
//                "name", "Opportunity Finder",
//                "descr", "Opportunity Finder",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "uses",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        ToolsHelper.CONTROL_CENTER_ASINS_TOOL_ID , [
//        "id", ToolsHelper.CONTROL_CENTER_ASINS_TOOL_ID,
//                "link", "",
//                "name", "Product Metrics",
//                "descr", "Control Center Product Metrics",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "ASINs",
//                "category", ToolsHelper.CATEGORY_OVERVIEW,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showOnMembersPricingPage", false,
//                "env", "prod",
//                "remainingUses" , [AsinSelection.class, "asinsRemaining"],
//        "remainingUsesBatch" , [AsinSelection.class, "asinsRemainingBatch"],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/my-products.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/my-products.png",
//                "tooltipTitle", "tooltip.pricing.myProducts",
//                "strategy", ControlCenterToolParametersStrategy.class,
//        ],
//        ToolsHelper.ELITE_TOOL_ID , [
//        "id", ToolsHelper.ELITE_TOOL_ID,
//                "link", "",
//                "name", "Elite",
//                "descr", "Mastermind group for top-tier sellers",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "access",
//                "category", ToolsHelper.CATEGORY_OVERVIEW,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showOnMembersPricingPage", true,
//                "env", "prod",
//                "usesSpecialText" , [
//        "<span>Add-on<br> <b>Starting at ${price}/mo</b></span>" , [
//                    ...PlansHelper.HELIUM10_DIAMOND_ONLY_PLANS,
//                    ...PlansHelper.HELIUM10_SCALE_YOUR_BUSINESS_PLANS,
//                    ...PlansHelper.HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLES,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/elite.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/elite.png",
//                "tooltipTitle", "tooltip.pricing.elite",
//                "strategy", SpecialTextPricePlaceholderReplacementStrategy.class,
//        ],
//        ToolsHelper.CONTROL_CENTER_DASHBOARD_TOOL_ID , [
//        "id", ToolsHelper.CONTROL_CENTER_DASHBOARD_TOOL_ID,
//                "link", "",
//                "name", "Dashboard Access",
//                "descr", "Customizable smart dashboard for sellers & brands",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "pages",
//                "category", ToolsHelper.CATEGORY_INSIGHTS_DASHBOARD,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showOnMembersPricingPage", true,
//                "env", "prod",
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/insights.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/insights.png",
//                "tooltipTitle", "tooltip.pricing.insights",
//        ],
//        ToolsHelper.CONTROL_CENTER_INSIGHTS_TOOL_ID , [
//        "id", ToolsHelper.CONTROL_CENTER_INSIGHTS_TOOL_ID,
//                "link", "",
//                "name", "Control Center Insights",
//                "descr", "Actionable insights to maximize growth",
//                "category", ToolsHelper.CATEGORY_OVERVIEW,
//                "suffix", "pages",
//                "showInNewSidebar", false,
//                "env", "prod",
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/insights-and-recommendations.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/insights-and-recommendations.png",
//                "tooltipTitle", "tooltip.pricing.insightsAndRecommendations",
//        ],
//        ToolsHelper.ADVANCED_BRAND_ANALYTICS_TOOL_ID , [
//        "id", ToolsHelper.ADVANCED_BRAND_ANALYTICS_TOOL_ID,
//                "link", "",
//                "name", "Advanced Brand Analytics",
//                "descr", "Analyze the marketplace & competition",
//                "category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH,
//                "suffix", "pages",
//                "showInNewSidebar", false,
//                "showInPlanDetails", true,
//                "env", "prod",
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/advanced-brand-analytics.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/advanced-brand-analytics.png",
//                "tooltipTitle", "tooltip.pricing.advancedBrandAnalytics",
//        ],
//        ToolsHelper.OVERVIEW_LISTING_OPTIMIZATION_TOOL_ID , [
//        "id", ToolsHelper.OVERVIEW_LISTING_OPTIMIZATION_TOOL_ID,
//                "link", "",
//                "name", "Listing Optimization",
//                "descr", "Tools to boost your ranking & maximize sales",
//                "category", ToolsHelper.CATEGORY_OVERVIEW,
//                "suffix", "pages",
//                "showInNewSidebar", false,
//                "usesSpecialText" , [
//        "Limited" , [
//                    ...PlansHelper.HELIUM10_START_YOUR_BUSINESS_PLANS,
//                PlansHelper.HELIUM10_FREE_PLAN,
//                PlansHelper.HELIUM10_STARTER_PLAN,
//                PlansHelper.HELIUM10_STARTER_39_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_PLAN,
//                PlansHelper.HELIUM10_STARTER_ANNUAL_339_PLAN,
//                ]
//            ],
//        "env", "prod",
//        ],
//        ToolsHelper.KEYWORD_TRACKER_BOOSTS_TOOL_ID , [
//        "id", ToolsHelper.KEYWORD_TRACKER_BOOSTS_TOOL_ID,
//                "link", "",
//                "name", "Keyword Tracker Boosts",
//                "descr", "Keyword Tracker Boosts",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "keywords",
//                "category", ToolsHelper.CATEGORY_OVERVIEW,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        ToolsHelper.KEYWORD_TRACKER_WALMART_BOOSTS_TOOL_ID , [
//        "id", ToolsHelper.KEYWORD_TRACKER_WALMART_BOOSTS_TOOL_ID,
//                "link", "",
//                "name", "Keyword Tracker Boosts for Walmart",
//                "descr", "Keyword Tracker Boosts for Walmart",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "keywords",
//                "category", ToolsHelper.CATEGORY_OVERVIEW,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "env", "prod",
//        ],
//        ToolsHelper.KEYWORD_SALES , [
//        "id", ToolsHelper.KEYWORD_SALES,
//                "link", "",
//                "name", "Keyword Sales",
//                "descr", "Estimated number of monthly sales attributed to each keyword",
//                "svg-icon", "",
//                "svg-class", "",
//                "suffix", "uses",
//                "category", ToolsHelper.CATEGORY_KEYWORD_RESEARCH,
//                "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showInPlanDetails", true,
//                "env", "prod",
//                "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/keyword-sales.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/keyword-sales.png",
//                "tooltipTitle", "tooltip.pricing.keywordSales",
//                "strategy", KeywordSalesToolParametersStrategy.class,
//        ],
//        ToolsHelper.BLACKBOX_ABA_TOOL_ID , [
//        "id", ToolsHelper.BLACKBOX_ABA_TOOL_ID,
//                "link", "/black-box/aba",
//                "name", "Black Box ABA",
//                "descr", "Black Box ABA",
//                "suffix", "uses",
//                "showInSidebar", false,
//                "nonReplenishablePlans", PlansHelper.HELIUM10_PLATINUM_LIKE_PLANS,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "showOnMembersPricingPage", false,
//                "env", "prod",
//                "isNew", true,
//        ],
//        ToolsHelper.REVIEW_ANALYZER_PRO_TOOL_ID , [
//        "id", ToolsHelper.REVIEW_ANALYZER_PRO_TOOL_ID,
//                "link", "/reviews-analysis",
//                "name", "Review Analyzer Pro",
//                "descr", "tooltip.menu.reviewAnalyzerPro",
//                "suffix", "",
//                "showInSidebar", false,
//                "showInPlanDetails", true,
//                "category", ToolsHelper.CATEGORY_ANALYTICS,
//                "showOnMembersPricingPage", true,
//                "env", "prod",
//                "showInNewSidebar", false,
//                "isNew", true,
//                "isBeta", true,
//                "usesSpecialText" , [
//        "Demo Only" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                    ...PlansHelper.HELIUM10_STARTER_ONLY_PLANS,
//                ],
//        "<span>Add-on <br> <b>Starting at ${price}/mo</b></span>" , [
//                    ...PlansHelper.HELIUM10_START_YOUR_BUSINESS_PLANS,
//                    ...PlansHelper.HELIUM10_PLATINUM_ONLY_PLANS,
//                ],
//        "<i class=" far fa -check " aria-hidden=" true "></i>" , [
//                    ...PlansHelper.HELIUM10_DIAMOND_ONLY_PLANS,
//                    ...PlansHelper.HELIUM10_SCALE_YOUR_BUSINESS_PLANS,
//                    ...PlansHelper.HELIUM10_ELITE_PLANS,
//                    ...PlansHelper.HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLES,
//                    ...PlansHelper.HELIUM10_SUPERCHARGE_YOUR_BRAND_PLANS,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/review-analyzer-pro.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/review-analyzer-pro.png",
//                "tooltipTitle", "tooltip.pricing.reviewAnalyzerPro",
//                "strategy" , [
//        RsaSpecialTextPricePlaceholderReplacementStrategy.class,
//                RsaToolParametersStrategy.class,
//            ],
//        "remainingUses" , [RsaToolAccessService.class, "getRemainingUses"],
//        "remainingUsesBatch" , [RsaToolAccessService.class, "getRemainingUsesBatch"],
//        ],
//        ToolsHelper.IDEAS_PREDICTED_MARKET_AI_TOOL_ID , [
//        "id", ToolsHelper.IDEAS_PREDICTED_MARKET_AI_TOOL_ID,
//                "link", "",
//                "name", "Ideas Market Prediction AI generator",
//                "descr", "Ideas Market Prediction AI generator",
//                "suffix", "uses",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "nonReplenishablePlans" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                ...PlansHelper.HELIUM10_STARTER_PLANS,
//                ...PlansHelper.HELIUM10_A_LA_CARTE_PLANS
//            ],
//        "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showInPlanDetails", false,
//                "showOnMembersPricingPage", false,
//                "env", "prod",
//        ],
//        ToolsHelper.IDEAS_SUMMARY_AI_TOOL_ID , [
//        "id", ToolsHelper.IDEAS_SUMMARY_AI_TOOL_ID,
//                "link", "",
//                "name", "Ideas Summary AI generator",
//                "descr", "Ideas Summary AI generator",
//                "suffix", "uses",
//                "replenishment-period", ReplenishmentPeriodEnum.daily->name,
//                "nonReplenishablePlans" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                ...PlansHelper.HELIUM10_STARTER_PLANS,
//                ...PlansHelper.HELIUM10_A_LA_CARTE_PLANS
//            ],
//        "showInSidebar", false,
//                "showInNewSidebar", false,
//                "showInPlanDetails", false,
//                "showOnMembersPricingPage", false,
//                "env", "prod",
//        ],
//        ToolsHelper.IDEAS_PRODUCTS_TOOL_ID , [
//        "id", ToolsHelper.IDEAS_PRODUCTS_TOOL_ID,
//                "link", "",
//                "name", "Ideas Products",
//                "descr", "Ideas Products",
//                "suffix", "",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "remainingUses" , [IdeaToolsHelper.class, "getProductIdeaToolUsesRemaining"],
//        "remainingUsesBatch" , [IdeaToolsHelper.class, "getProductIdeaToolUsesRemainingBatch"],
//        "env", "prod",
//        ],
//        ToolsHelper.IDEAS_KEYWORDS_TOOL_ID , [
//        "id", ToolsHelper.IDEAS_KEYWORDS_TOOL_ID,
//                "link", "",
//                "name", "Ideas Keywords",
//                "descr", "Ideas Keywords",
//                "suffix", "",
//                "showInSidebar", false,
//                "showInPlanDetails", false,
//                "showInNewSidebar", false,
//                "remainingUses" , [IdeaToolsHelper.class, "getKeywordIdeaToolUsesRemaining"],
//        "remainingUsesBatch" , [IdeaToolsHelper.class, "getKeywordIdeaToolUsesRemainingBatch"],
//        "env", "prod",
//        ],
//        ToolsHelper.IDEAS_TOOL_ID , [
//        "id", ToolsHelper.IDEAS_TOOL_ID,
//                "link", "/dashboard/product-ideas",
//                "name", "Product Launchpad",
//                "descr", "tooltip.pricing.planValidateProductIdeas",
//                "category", ToolsHelper.CATEGORY_PRODUCT_RESEARCH,
//                "suffix", "",
//                "showInSidebar", true,
//                "showInPlanDetails", true,
//                "showInNewSidebar", true,
//                "isNew", true,
//                "tags" , ["AI"],
//        "env", "prod",
//                "remainingUses" , [IdeaToolsHelper.class, "getIdeaToolUsesRemaining"],
//        "remainingUsesBatch" , [IdeaToolsHelper.class, "getIdeaToolUsesRemainingBatch"],
//        "usesSpecialText" , [
//        "Limited" , [
//        PlansHelper.HELIUM10_FREE_PLAN,
//                    ...PlansHelper.HELIUM10_STARTER_PLANS,
//                    ...PlansHelper.HELIUM10_ENTREPRENEUR_PLANS,
//                ],
//            ],
//        "tooltipImageUrl", "https://cdn.helium10.com/h10/tooltips/img/default-size/ideas.png",
//                "tooltipImageRetinaUrl", "https://cdn.helium10.com/h10/tooltips/img/retina-size/ideas.png",
//                "tooltipTitle", "tooltip.pricing.planValidateProductIdeas",
//        ],
//    ],
    }};
}
