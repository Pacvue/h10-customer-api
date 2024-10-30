package com.pacvue.h10.customer.api.infrastructure.helper;

import com.pacvue.h10.customer.api.domain.customer.entity.StripePlan;
import com.pacvue.h10.customer.api.domain.customer.mapper.StripePlanMapper;
import com.pacvue.h10.customer.api.infrastructure.util.RedisService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A set of Stringants and methods which helps to work with Stripe Plans and Subscriptions
 */
@Component
public class PlansHelper {

    @Resource
    private RedisService redisService;
    @Resource
    private StripePlanMapper stripePlanMapper;

    public static String HELIUM10_ENTERPRISE_PRODUCT = "Helium10_Enterprise";

    // Monthly Plans
    public static String HELIUM10_FREE_PLAN = "Helium10_Free";
    public static String HELIUM10_STARTER_PLAN = "Helium10_Starter";
    public static String HELIUM10_STARTER_39_PLAN = "Helium10_Starter_39";
    public static String HELIUM10_A_LA_CARTE_PLAN = "Helium10_ALaCarte";
    public static String HELIUM10_GOLD_PLAN = "Helium10_Gold";
    public static String HELIUM10_PLATINUM_PLAN = "Helium10_Platinum";
    public static String HELIUM10_PLATINUM_99_PLAN = "Helium10_Platinum_99";
    public static String HELIUM10_PLATINUM_FAST_ACTION_PLAN = "Helium10_Platinum_FastAction";
    public static String HELIUM10_DIAMOND_PLAN = "Helium10_Diamond";
    public static String HELIUM10_DIAMOND_199_PLAN = "Helium10_Diamond_199";
    public static String HELIUM10_DIAMOND_249_PLAN = "Helium10_Diamond_249";
    public static String HELIUM10_ELITE_PLAN = "Helium10_Elite";
    public static String HELIUM10_ELITE_399_PLAN = "Helium10_Elite_399";

    // Quarterly Plans
    public static String HELIUM10_ELITE_QUARTER_PLAN = "Helium10_Elite_Quarter";

    // Annual Plans
    public static String HELIUM10_STARTER_ANNUAL_PLAN = "Helium10_StarterAnnual";
    public static String HELIUM10_STARTER_ANNUAL_339_PLAN = "Helium10_StarterAnnual_339";
    public static String HELIUM10_A_LA_CARTE_ANNUAL_PLAN = "Helium10_ALaCarteAnnual";
    public static String HELIUM10_GOLD_ANNUAL_PLAN = "Helium10_GoldAnnual";
    public static String HELIUM10_PLATINUM_ANNUAL_PLAN = "Helium10_PlatinumAnnual";
    public static String HELIUM10_PLATINUM_ANNUAL_999_PLAN = "Helium10_PlatinumAnnual_999";
    public static String HELIUM10_DIAMOND_ANNUAL_PLAN = "Helium10_DiamondAnnual";
    public static String HELIUM10_DIAMOND_ANNUAL_1999_PLAN = "Helium10_DiamondAnnual_1999";
    public static String HELIUM10_DIAMOND_ANNUAL_2499_PLAN = "Helium10_DiamondAnnual_2499";
    public static String HELIUM10_ELITE_ANNUAL_PLAN = "Helium10_Elite_Annual";

    // A La Carte Plans
    public static String HELIUM10_A_LA_CARTE_MAGNET = "Helium10_ALC_Magnet";
    public static String HELIUM10_A_LA_CARTE_MAGNET_39 = "Helium10_ALC_Magnet_39";
    public static String HELIUM10_A_LA_CARTE_KT = "Helium10_ALC_KeywordTracker";
    public static String HELIUM10_A_LA_CARTE_KT_59 = "Helium10_ALC_KeywordTracker_59";
    public static String HELIUM10_A_LA_CARTE_HJA = "Helium10_ALC_HijackerAlert";
    public static String HELIUM10_A_LA_CARTE_ALERTS_39 = "Helium10_ALC_Alerts_39";
    public static String HELIUM10_A_LA_CARTE_RG = "Helium10_ALC_RefundGenie";
    public static String HELIUM10_A_LA_CARTE_RG_99 = "Helium10_ALC_RefundGenie_99";
    public static String HELIUM10_A_LA_CARTE_CEREBRO = "Helium10_ALC_Cerebro";
    public static String HELIUM10_A_LA_CARTE_CEREBRO_39 = "Helium10_ALC_Cerebro_39";
    public static String HELIUM10_A_LA_CARTE_BLACKBOX = "Helium10_ALC_BlackBox";
    public static String HELIUM10_A_LA_CARTE_BLACKBOX_39 = "Helium10_ALC_BlackBox_39";
    public static String HELIUM10_A_LA_CARTE_5KCHECKER = "Helium10_ALC_5KChecker";
    public static String HELIUM10_A_LA_CARTE_IC_19 = "Helium10_ALC_IndexChecker_19";
    public static String HELIUM10_A_LA_CARTE_XRAY = "Helium10_ALC_Extension";
    public static String HELIUM10_A_LA_CARTE_XRAY_19 = "Helium10_ALC_Extension_19";
    public static String HELIUM10_A_LA_CARTE_PROFITS = "Helium10_ALC_Profits";
    public static String HELIUM10_A_LA_CARTE_PROFITS_39 = "Helium10_ALC_Profits_39";

    public static String HELIUM10_A_LA_CARTE_MAGNET_ANNUAL = "Helium10_ALC_Magnet_Annual";
    public static String HELIUM10_A_LA_CARTE_MAGNET_ANNUAL_390 = "Helium10_ALC_Magnet_Annual_390";
    public static String HELIUM10_A_LA_CARTE_KT_ANNUAL = "Helium10_ALC_KeywordTracker_Annual";
    public static String HELIUM10_A_LA_CARTE_KT_ANNUAL_590 = "Helium10_ALC_KeywordTracker_Annual_590";
    public static String HELIUM10_A_LA_CARTE_HJA_ANNUAL = "Helium10_ALC_HijackerAlert_Annual";
    public static String HELIUM10_A_LA_CARTE_ALERTS_ANNUAL_390 = "Helium10_ALC_Alerts_Annual_390";
    public static String HELIUM10_A_LA_CARTE_RG_ANNUAL = "Helium10_ALC_RefundGenie_Annual";
    public static String HELIUM10_A_LA_CARTE_RG_ANNUAL_990 = "Helium10_ALC_RefundGenie_Annual_990";
    public static String HELIUM10_A_LA_CARTE_CEREBRO_ANNUAL = "Helium10_ALC_Cerebro_Annual";
    public static String HELIUM10_A_LA_CARTE_CEREBRO_ANNUAL_390 = "Helium10_ALC_Cerebro_Annual_390";
    public static String HELIUM10_A_LA_CARTE_BLACKBOX_ANNUAL = "Helium10_ALC_BlackBox_Annual";
    public static String HELIUM10_A_LA_CARTE_BLACKBOX_ANNUAL_390 = "Helium10_ALC_BlackBox_Annual_390";
    public static String HELIUM10_A_LA_CARTE_5KCHECKER_ANNUAL = "Helium10_ALC_5KChecker_Annual";
    public static String HELIUM10_A_LA_CARTE_IC_ANNUAL_190 = "Helium10_ALC_IndexChecker_Annual_190";
    public static String HELIUM10_A_LA_CARTE_XRAY_ANNUAL = "Helium10_ALC_Extension_Annual";
    public static String HELIUM10_A_LA_CARTE_XRAY_ANNUAL_190 = "Helium10_ALC_Extension_Annual_190";
    public static String HELIUM10_A_LA_CARTE_PROFITS_ANNUAL = "Helium10_ALC_Profits_Annual";
    public static String HELIUM10_A_LA_CARTE_PROFITS_ANNUAL_390 = "Helium10_ALC_Profits_Annual_390";

    // Chinese plans
    public static String HELIUM10_EXPLORER_CN = "Helium10_Explorer_Cn";
    public static String HELIUM10_ENTREPRENEUR_CN = "Helium10_Entrepreneur_Cn";
    public static String HELIUM10_PROFESSIONAL_CN = "Helium10_Professional_Cn";
    public static String HELIUM10_EXPLORER_CN_ANNUAL = "Helium10_Explorer_Cn_Annual";
    public static String HELIUM10_ENTREPRENEUR_CN_ANNUAL = "Helium10_Entrepreneur_Cn_Annual";
    public static String HELIUM10_PROFESSIONAL_CN_ANNUAL = "Helium10_Professional_Cn_Annual";

    public static List<String> HELIUM10_A_LA_CARTE_PLANS = Arrays.asList(
            HELIUM10_A_LA_CARTE_PLAN,
            HELIUM10_A_LA_CARTE_ANNUAL_PLAN);

    public static List<String> HELIUM10_STARTER_PLANS = Arrays.asList(
            HELIUM10_STARTER_PLAN,
            HELIUM10_STARTER_39_PLAN,
            HELIUM10_STARTER_ANNUAL_PLAN,
            HELIUM10_STARTER_ANNUAL_339_PLAN,
            // Chinese plans
            HELIUM10_EXPLORER_CN,
            HELIUM10_EXPLORER_CN_ANNUAL
    );

    public static List<String> HELIUM10_STARTER_ONLY_PLANS = Arrays.asList(
            HELIUM10_STARTER_PLAN,
            HELIUM10_STARTER_39_PLAN,
            HELIUM10_STARTER_ANNUAL_PLAN,
            HELIUM10_STARTER_ANNUAL_339_PLAN);

    public static List<String> HELIUM10_PLATINUM_MONTHLY_PLANS = Arrays.asList(
            HELIUM10_PLATINUM_PLAN,
            HELIUM10_PLATINUM_99_PLAN);

    public static List<String> HELIUM10_PLATINUM_ANNUAL_PLANS = Arrays.asList(
            HELIUM10_PLATINUM_ANNUAL_PLAN,
            HELIUM10_PLATINUM_ANNUAL_999_PLAN);

//    List<String> HELIUM10_PLATINUM_LIKE_ANNUAL_PLANS = List.of(
//            HELIUM10_PLATINUM_ANNUAL_PLANS,
//    HELIUM10_START_YOUR_BUSINESS_ANNUAL_PLAN,
//    HELIUM10_ENTREPRENEUR_CN_ANNUAL);

    public static List<String> HELIUM10_PLATINUM_PLANS = Arrays.asList(
            HELIUM10_PLATINUM_PLAN,
            HELIUM10_PLATINUM_99_PLAN,
            HELIUM10_PLATINUM_ANNUAL_PLAN,
            HELIUM10_PLATINUM_ANNUAL_999_PLAN,
            // Chinese plans
            HELIUM10_ENTREPRENEUR_CN,
            HELIUM10_ENTREPRENEUR_CN_ANNUAL
    );

    public static List<String> HELIUM10_PLATINUM_ONLY_PLANS = Stream.concat(
            Stream.of(HELIUM10_PLATINUM_PLAN, HELIUM10_PLATINUM_99_PLAN),
            HELIUM10_PLATINUM_ANNUAL_PLANS.stream()
    ).collect(Collectors.toList());

//    List<String> HELIUM10_PLATINUM_LIKE_PLANS = [
//                HELIUM10_PLATINUM_PLANS,
//            HELIUM10_START_YOUR_BUSINESS_PLANS,
//            ];

    public static List<String> HELIUM10_DIAMOND_ANNUAL_PLANS = Arrays.asList(
            HELIUM10_DIAMOND_ANNUAL_PLAN,
            HELIUM10_DIAMOND_ANNUAL_1999_PLAN,
            HELIUM10_DIAMOND_ANNUAL_2499_PLAN);

    List<String> HELIUM10_DIAMOND_PLANS = Stream.concat(Stream.of(
                    HELIUM10_DIAMOND_PLAN,
                    HELIUM10_DIAMOND_199_PLAN,
                    HELIUM10_DIAMOND_249_PLAN,
                    // Chinese plans
                    HELIUM10_PROFESSIONAL_CN,
                    HELIUM10_PROFESSIONAL_CN_ANNUAL),
            HELIUM10_DIAMOND_ANNUAL_PLANS.stream()).collect(Collectors.toList());

    //    List<String> HELIUM10_DIAMOND_LIKE_PLANS = List.of(
//            ...HELIUM10_DIAMOND_PLANS,
//            ...HELIUM10_SCALE_YOUR_BUSINESS_LIKE_PLANS,
//            ];
//
    List<String> HELIUM10_DIAMOND_MONTHLY_PLANS = Arrays.asList(
            HELIUM10_DIAMOND_PLAN,
            HELIUM10_DIAMOND_199_PLAN,
            HELIUM10_DIAMOND_249_PLAN);

    List<String> HELIUM10_DIAMOND_ONLY_PLANS = Arrays.asList(
            HELIUM10_DIAMOND_PLAN,
            HELIUM10_DIAMOND_199_PLAN,
            HELIUM10_DIAMOND_249_PLAN,
            HELIUM10_DIAMOND_ANNUAL_PLAN,
            HELIUM10_DIAMOND_ANNUAL_1999_PLAN,
            HELIUM10_DIAMOND_ANNUAL_2499_PLAN);

    List<String> HELIUM10_ELITE_PLANS = Arrays.asList(
            HELIUM10_ELITE_PLAN,
            HELIUM10_ELITE_399_PLAN,
            HELIUM10_ELITE_QUARTER_PLAN,
            HELIUM10_ELITE_ANNUAL_PLAN);

    // Follow-Up Plans
    public static String HELIUM10_FOLLOW_UP_BEGINNER = "Helium10_FollowUp_Beginner";
    public static String HELIUM10_FOLLOW_UP_PRO = "Helium10_FollowUp_Pro";
    public static String HELIUM10_FOLLOW_UP_ENTERPRISE = "Helium10_FollowUp_Enterprise";

    // MT360 Plans
    public static String HELIUM10_MT360_PLAN = "Helium10_MT360";
    public static String HELIUM10_MT360_ANNUAL_PLAN = "Helium10_MT360_Annual";

    List<String> HELIUM10_MT360_PLANS = Arrays.asList(
            HELIUM10_MT360_PLAN,
            HELIUM10_MT360_ANNUAL_PLAN);

    // Start Your Business plans
    public static String HELIUM10_START_YOUR_BUSINESS_PLAN = "Helium10_Start_Your_Business";
    public static String HELIUM10_START_YOUR_BUSINESS_QUARTER_PLAN = "Helium10_Start_Your_Business_Quarter";
    public static String HELIUM10_START_YOUR_BUSINESS_ANNUAL_PLAN = "Helium10_Start_Your_Business_Annual";
    List<String> HELIUM10_START_YOUR_BUSINESS_PLANS = Arrays.asList(
            HELIUM10_START_YOUR_BUSINESS_PLAN,
            HELIUM10_START_YOUR_BUSINESS_QUARTER_PLAN,
            HELIUM10_START_YOUR_BUSINESS_ANNUAL_PLAN);
    List<String> HELIUM10_START_YOUR_BUSINESS_MONTHLY_PLANS = Arrays.asList(
            HELIUM10_START_YOUR_BUSINESS_PLAN);

    // Scale Your Business plans
    public static String HELIUM10_SCALE_YOUR_BUSINESS_PLAN = "Helium10_Scale_Your_Business";
    public static String HELIUM10_SCALE_YOUR_BUSINESS_QUARTER_PLAN = "Helium10_Scale_Your_Business_Quarter";
    public static String HELIUM10_SCALE_YOUR_BUSINESS_ANNUAL_PLAN = "Helium10_Scale_Your_Business_Annual";
    List<String> HELIUM10_SCALE_YOUR_BUSINESS_PLANS = Arrays.asList(
            HELIUM10_SCALE_YOUR_BUSINESS_PLAN,
            HELIUM10_SCALE_YOUR_BUSINESS_QUARTER_PLAN,
            HELIUM10_SCALE_YOUR_BUSINESS_ANNUAL_PLAN);

    List<String> HELIUM10_SCALE_YOUR_BUSINESS_MONTHLY_PLANS = Arrays.asList(
            HELIUM10_SCALE_YOUR_BUSINESS_PLAN);

    // Supercharge Your Brand plans
    public static String HELIUM10_SUPERCHARGE_YOUR_BRAND_PLAN = "Helium10_Supercharge_Your_Brand";
    public static String HELIUM10_SUPERCHARGE_YOUR_BRAND_QUARTER_PLAN = "Helium10_Supercharge_Your_Brand_Quarter";
    public static String HELIUM10_SUPERCHARGE_YOUR_BRAND_ANNUAL_PLAN = "Helium10_Supercharge_Your_Brand_Annual";
    List<String> HELIUM10_SUPERCHARGE_YOUR_BRAND_PLANS = Arrays.asList(
            HELIUM10_SUPERCHARGE_YOUR_BRAND_PLAN,
            HELIUM10_SUPERCHARGE_YOUR_BRAND_QUARTER_PLAN,
            HELIUM10_SUPERCHARGE_YOUR_BRAND_ANNUAL_PLAN);
    List<String> HELIUM10_ELITE_LIKE_PLANS = Stream.concat(
            HELIUM10_ELITE_PLANS.stream(),
            HELIUM10_SUPERCHARGE_YOUR_BRAND_PLANS.stream()).collect(Collectors.toList());
    // Bundles
    public static String HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLE = "Helium10_Adtomic_And_Scale_Your_Business_Bundle";
    public static String HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLE_ANNUAL = "Helium10_Adtomic_And_Scale_Your_Business_Bundle_Annual";
    List<String> HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLES = Arrays.asList(
            HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLE,
            HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLE_ANNUAL);
    List<String> HELIUM10_SCALE_YOUR_BUSINESS_LIKE_PLANS = Stream.concat(
            HELIUM10_SCALE_YOUR_BUSINESS_PLANS.stream(),
            HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLES.stream()).collect(Collectors.toList());
    List<String> HELIUM10_BUNDLE_PLANS = new ArrayList<>(HELIUM10_ADTOMIC_AND_SCALE_YOUR_BUSINESS_BUNDLES);

    public static String PLANS_INTERVAL_MONTH = "month";
    public static String PLANS_INTERVAL_YEAR = "year";
    public static Integer PLANS_INTERVAL_COUNT_1 = 1;
    public static Integer PLANS_INTERVAL_COUNT_3 = 3;
    public static String STARTER_PLAN_RELEASE_DATE = "2021-04-06";
    public static List<String> CHINESE_PLANS_COUNTRIES = Arrays.asList("CN", "TW", "HK");
    public static String PLANS_PERIOD_MONTHLY = "monthly";
    public static String PLANS_PERIOD_QUARTERLY = "quarterly";
    public static String PLANS_PERIOD_ANNUAL = "annual";
    public static String PLANS_PERIOD_HALF_YEAR = "half-year";
    public static String PLANS_PERIOD_MONTHLY_SHORT = "mo";
    public static String PLANS_PERIOD_QUARTERLY_SHORT = "qt";
    public static String PLANS_PERIOD_ANNUAL_SHORT = "yr";

    List<String> PLANS_PERIODS = Arrays.asList(
            PLANS_PERIOD_MONTHLY,
            PLANS_PERIOD_QUARTERLY,
            PLANS_PERIOD_HALF_YEAR,
            PLANS_PERIOD_ANNUAL);

    Map<String, List<String>> PLANS_OPTIONS_PERIODS_MAP = new HashMap<>() {
        {
            put(PLANS_PERIOD_MONTHLY, Arrays.asList("plansOptions", "plansOptionsCn"));
            put(PLANS_PERIOD_ANNUAL, Arrays.asList("annualPlans", "annualPlansCn"));
        }
    };

    Map<String, String> BUNDLES_OPTIONS_PERIODS_MAP = new HashMap<>() {
        {
            put(PLANS_PERIOD_MONTHLY, PLANS_PERIOD_MONTHLY);
            put(PLANS_PERIOD_ANNUAL, PLANS_PERIOD_ANNUAL);
        }
    };

    List<String> HELIUM10_EXPLORER_PLANS = Arrays.asList(
            HELIUM10_EXPLORER_CN,
            HELIUM10_EXPLORER_CN_ANNUAL);

    List<String> HELIUM10_ENTREPRENEUR_PLANS = Arrays.asList(
            HELIUM10_ENTREPRENEUR_CN,
            HELIUM10_ENTREPRENEUR_CN_ANNUAL);

    List<String> HELIUM10_PROFESSIONAL_PLANS = Arrays.asList(
            HELIUM10_PROFESSIONAL_CN,
            HELIUM10_PROFESSIONAL_CN_ANNUAL);

    List<String> HELIUM10_CHINESE_PLANS = Stream.concat(
            Stream.concat(HELIUM10_EXPLORER_PLANS.stream(), HELIUM10_ENTREPRENEUR_PLANS.stream()),
            HELIUM10_PROFESSIONAL_PLANS.stream()).collect(Collectors.toList());

    List<String> HELIUM10_NO_PRICE_PLANS = Stream.concat(Stream.of(HELIUM10_FREE_PLAN), HELIUM10_A_LA_CARTE_PLANS.stream()).collect(Collectors.toList());

//    protected static $uses = [];
//
//    protected static $availableTools = [];
//
//    protected static $couponsData = [];
//
//    /**
//     * This param used for prevent applying some coupons for some plans
//     * @var array<string, array>
//     */
//    protected static $specialCoupons = [
//            "ECOMHACKERS" => [
//    PlansHelper::HELIUM10_DIAMOND_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_199_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_249_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_1999_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_2499_PLAN,
//    // Chinese plans
//    PlansHelper::HELIUM10_PROFESSIONAL_CN,
//    PlansHelper::HELIUM10_PROFESSIONAL_CN_ANNUAL,
//            ],
//            "ADSVIP" => [
//    PlansHelper::HELIUM10_DIAMOND_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_199_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_249_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_1999_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_2499_PLAN,
//    // Chinese plans
//    PlansHelper::HELIUM10_PROFESSIONAL_CN,
//    PlansHelper::HELIUM10_PROFESSIONAL_CN_ANNUAL,
//            ],
//            "GROW25" => [
//    PlansHelper::HELIUM10_DIAMOND_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_199_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_249_PLAN,
//    // Chinese plans
//    PlansHelper::HELIUM10_PROFESSIONAL_CN,
//            ],
//            "INVENTORY25" => [
//    PlansHelper::HELIUM10_DIAMOND_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_199_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_249_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_1999_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_2499_PLAN,
//    // Chinese plans
//    PlansHelper::HELIUM10_PROFESSIONAL_CN,
//    PlansHelper::HELIUM10_PROFESSIONAL_CN_ANNUAL,
//            ],
//            "LAUNCH820" => [
//    PlansHelper::HELIUM10_PLATINUM_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_ANNUAL_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_199_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_249_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_1999_PLAN,
//    PlansHelper::HELIUM10_DIAMOND_ANNUAL_2499_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_99_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_ANNUAL_999_PLAN,
//    // Chinese plans
//    PlansHelper::HELIUM10_ENTREPRENEUR_CN,
//    PlansHelper::HELIUM10_ENTREPRENEUR_CN_ANNUAL,
//    PlansHelper::HELIUM10_PROFESSIONAL_CN,
//    PlansHelper::HELIUM10_PROFESSIONAL_CN_ANNUAL,
//            ],
//            "BLUESKY.*" => [
//    PlansHelper::HELIUM10_PLATINUM_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_ANNUAL_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_99_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_ANNUAL_999_PLAN,
//    // Chinese plans
//    PlansHelper::HELIUM10_ENTREPRENEUR_CN,
//    PlansHelper::HELIUM10_ENTREPRENEUR_CN_ANNUAL,
//            ],
//            "ALLAIN.*" => [
//    PlansHelper::HELIUM10_PLATINUM_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_ANNUAL_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_99_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_ANNUAL_999_PLAN,
//    // Chinese plans
//    PlansHelper::HELIUM10_ENTREPRENEUR_CN,
//    PlansHelper::HELIUM10_ENTREPRENEUR_CN_ANNUAL,
//            ],
//            "GROW9.*" => [
//    PlansHelper::HELIUM10_PLATINUM_PLAN,
//    PlansHelper::HELIUM10_PLATINUM_99_PLAN,
//    // Chinese plans
//    PlansHelper::HELIUM10_ENTREPRENEUR_CN,
//            ],
//            ];
//
//    /**
//     * @var array
//     */
//    private static $stripePlanList = [];
//
//    /**
//     * @param string $planId
//     * @return array|mixed
//     * @throws Throwable
//     */
//    public static function getUsesDataByPlan(string $planId): mixed
//    {
//        $limitsProvider = new UsesLimitsProvider();
//
//        if ($planId === HELIUM10_ENTERPRISE_PRODUCT) {
//            $currentUserManager = Yii::$container->get(CurrentUserManager::class);
//
//            if ($currentUserManager->isGuest()) {
//                return [];
//            }
//
//            $accountSubscription = $currentUserManager->getAccount()?->stripeSubscription;
//
//            if ($accountSubscription?->StripeProduct_id === PlansHelper::HELIUM10_ENTERPRISE_PRODUCT) {
//                $planUses = $limitsProvider->get($accountSubscription->getSubscriptionPlan(false, true));
//            } else {
//                return [];
//            }
//        } else {
//            $planUses = $limitsProvider->get($planId);
//        }
//
//        return $planUses;
//    }
//
//    /**
//     * @param $planId
//     * @param mixed|null $moduleId
//     * @return array
//     * @throws Throwable
//     */
//    public static function getUsesForPlan($planId, $moduleId = null)
//    {
//        $planUses = getUsesDataByPlan($planId);
//
//        if (!$planUses) {
//            return [];
//        }
//
//        $tools = ($moduleId && isset(Yii::$app->params["tools"][$moduleId]))
//            ? [$moduleId => Yii::$app->params["tools"][$moduleId]]
//            : Yii::$app->params["tools"];
//        $availableTools = getAvailableTools();
//
//        $usesData = [];
//
//        foreach ($tools as $toolId => $toolOptions) {
//        if (!array_key_exists($toolId, $availableTools)) {
//            continue;
//        }
//
//        $planOptions = $planUses[$toolId] ?? ["type" => "uses", "value" => 0, "value_descr" => Yii::t("pricing", "uses"), "days" => 0];
//        $unlimited = false;
//        $notUnlimitedPlans = [
//        HELIUM10_FREE_PLAN,
//                HELIUM10_STARTER_PLAN,
//                HELIUM10_STARTER_39_PLAN,
//                HELIUM10_STARTER_ANNUAL_PLAN,
//                HELIUM10_STARTER_ANNUAL_339_PLAN,
//                HELIUM10_A_LA_CARTE_PLAN,
//                HELIUM10_A_LA_CARTE_ANNUAL_PLAN,
//                // Chinese plans
//                HELIUM10_EXPLORER_CN,
//                HELIUM10_EXPLORER_CN_ANNUAL,
//            ];
//        $platinumNotUnlimitedTools = [
//        "cerebro-walmart",
//                "keywordresearch-walmart",
//                "xray-walmart",
//                "profits-walmart",
//                "refundgenie",
//            ];
//        if (in_array($toolId, $platinumNotUnlimitedTools)) {
//            $notUnlimitedPlans = array_merge($notUnlimitedPlans, HELIUM10_PLATINUM_PLANS);
//        }
//
//        $isProfitsWalmartForPlatinum = $toolId === "profits-walmart"
//                && in_array($planId, HELIUM10_PLATINUM_PLANS, true);
//
//        $nonReplenishablePlans = $tools[$toolId]["nonReplenishablePlans"] ?? [];
//
//        $toolsWithRealUses = [
//        "blackbox",
//                "cerebro",
//                "cerebro-walmart",
//                "keywordresearch",
//                "keywordresearch-walmart",
//            ];
//        $isChinesePlanAndToolWithRealUses = in_array($planId, HELIUM10_CHINESE_PLANS, true)
//                && in_array($toolId, $toolsWithRealUses, true);
//
//        if (
//                !in_array($planId, $notUnlimitedPlans, true)
//                        && !in_array($planId, $nonReplenishablePlans, true)
//                        && $planOptions["type"] !== "up-to"
//                        && $planOptions["type"] !== "with-token"
//                        && $toolId !== "_5kchecker"
//                        && !$isProfitsWalmartForPlatinum
//                        && (!isset($toolOptions["showLimits"]) || !$toolOptions["showLimits"])
//                        && !$isChinesePlanAndToolWithRealUses
//        ) {
//            $class = ($planOptions["type"] == "uses" && $planOptions["value"] == 0) ? "icon-dash" : "fa fa-check";
//            $text = "<i class="" . $class . "" style="color: #00aa00;" aria-hidden="true"></i>";
//            $unlimited = true;
//        } else {
//            $dashIcon = "<div class="icon-container"><span class="icon-dash centered-gray-icon"></span></div>";
//            $usesValue = $planOptions["value"];
//            $usesValueText = Yii::$app->formatter->asDecimal($usesValue);
//
//            switch ($planOptions["type"]) {
//                case "uses":
//                    if ($usesValue == 0) {
//                        $text = "-";
//                    } elseif ($usesValue >= 10000000) {
//                    $text = Yii::t("pricing", "Unlimited");
//                } else {
//                    $text = "{$usesValueText}" . " " . Yii::t("pricing", $planOptions["value_descr"]);
//                    $similarToFreePlans = array_values(array_unique(array_merge(
//                                    [HELIUM10_FREE_PLAN],
//                            HELIUM10_STARTER_PLANS,
//                            $nonReplenishablePlans
//                    )));
//                    $perMoTools = ["followup", "listing-analyzer"];
//
//                    if (
//                            in_array($toolId, array_keys(InvocationLimits::TOOL_PLANS_LIMITS), true)
//                                    && in_array($planId, array_keys(InvocationLimits::getToolPlansLimitsMap($toolId)), true)
//                            ) {
//                        $limit = InvocationLimits::getToolPlanLimit($toolId, $planId);
//                        $text = Yii::t("pricing", "{limit} launches", ["limit" => $limit]);
//                    } elseif ($toolId === "listing-builder") {
//                        $text .= "";
//                    } elseif (
//                            isset($tools[$toolId]["replenishment-period"])
//                                    && $tools[$toolId]["replenishment-period"] === ReplenishmentPeriodEnum::daily->name
//                            && !in_array($planId, $nonReplenishablePlans, true)
//                            ) {
//                        $text .= " " . Yii::t("pricing", "{quantity}per day", ["quantity" => ""]);
//                    } elseif ($toolId === "qr-codes-portals") {
//                        $text .= " " . Yii::t("pricing", "{quantity}per month", ["quantity" => ""]);
//                    } elseif (!in_array($planId, $similarToFreePlans, true) || in_array($toolId, $perMoTools)) {
//                        $text .= " " . Yii::t("pricing", "{quantity}/ mo{month}", ["quantity" => "", "month" => ""]);
//                    }
//                }
//                break;
//                case "unlimited":
//                    $icon = Html::tag("i", "", [
//                    "class" => "fa fa-check centered-gray-icon",
//                        "aria-hidden" => true,
//                        ]);
//                    $text = Html::tag("div", $icon, ["class" => "icon-container"]);
//                    break;
//                case "up-to":
//                    $text = $usesValue > 0 ?
//                            Yii::t(
//                        "pricing",
//                        "Up to {usesValueText} {valueDescr}",
//                                [
//                    "usesValueText" => $usesValueText,
//                        "valueDescr" => Yii::t("pricing", $planOptions["value_descr"]),
//                                ]
//                            )
//                            : $dashIcon;
//                    break;
//                case "with-token":
//                    $text = Yii::t("pricing", "With token connected");
//                    break;
//                case "limited":
//                    $text = isset($planOptions["days"]) && $planOptions["days"] > 0
//                            ? Yii::t("pricing", "{planOptionsDays, plural, =1{# day} other {# days}}", ["planOptionsDays" => $planOptions["days"]])
//                            : Yii::t("pricing", "Limited");
//                    break;
//                default:
//                    $text = $dashIcon;
//            }
//        }
//
//        $usesData[$toolId] = [
//        "type" => $planOptions["type"],
//                "text" => $text,
//                "fontSize" => $tools[$toolId]["plan-details-font-size"] ?? "",
//                "unlimited" => $unlimited,
//                "value" => $planOptions["value"],
//                "days" => $planOptions["days"] ?? null,
//                "value_descr" => $planOptions["value_descr"],
//                "specialText" => ToolsHelper::getToolUsesSpecialText($toolId, $planId),
//        "limited_time" => (bool)($planOptions["limited_time"] ?? false),
//            ];
//    }
//
//        return $usesData;
//    }
//
//    /**
//     * @param string $planId
//     * @param string $moduleId
//     * @return int
//     * @throws Throwable
//     */
//    public static function getUsesByPlanAndTool(string $planId, string $moduleId): int
//    {
//        $planUses = getUsesForPlan($planId, $moduleId);
//
//        return (int) ($planUses[$moduleId]["value"] ?? null);
//    }
//
//    /**
//     * @return array|mixed|null
//     * @throws InvalidArgumentException
//     */
//    public static function getAllUses(): ?array
//    {
//        if (!$uses) {
//            $uses = Yii::$app->systemParamsStorage->asArray("uses");
//            $annualPlans = array_merge(
//                    getAllPlansOptions(PLANS_PERIOD_ANNUAL),
//                    getAllPlansOptionsLegacy(PLANS_PERIOD_ANNUAL),
//                    getAllBundlesOptions(PLANS_PERIOD_ANNUAL)
//            );
//
//            foreach ($uses as $plan => &$limit) {
//                if (isset($annualPlans[$plan])) {
//                    $limit = $uses[$annualPlans[$plan]["correspondingMonthlyPlan"] ?? $plan];
//                }
//            }
//
//            $uses = $uses;
//        }
//
//        return $uses;
//    }
//
//    /**
//     * Checks availability of a particular tool by its ID
//     * @param $toolId
//     * @return bool
//     */
//    public static function checkToolAvailability($toolId)
//    {
//        $toolsEnv = (defined("YII_BETA_TEST") && YII_BETA_TEST === true) || YII_ENV == "prod"
//                ? ["prod"]
//            : ["prod", "dev"];
//        $tools = Yii::$app->params["tools"];
//
//        if (!isset($tools[$toolId])) {
//            return false;
//        }
//
//        // Check access
//        $allow = true;
//
//        if (isset($tools[$toolId]["rbacRoles"]) && $tools[$toolId]["rbacRoles"]) {
//            if (!is_array($tools[$toolId]["rbacRoles"])) {
//                $tools[$toolId]["rbacRoles"] = [$tools[$toolId]["rbacRoles"]];
//            }
//
//            $allow = false;
//
//            if (!(Yii::$app instanceof ConsoleApplication) && !Yii::$app->user->isGuest) {
//                foreach ($tools[$toolId]["rbacRoles"] as $rbacRole) {
//                    if (Yii::$app->user->can($rbacRole)) {
//                        $allow = true;
//
//                        break;
//                    }
//                }
//            }
//        }
//
//        // Check environment
//        if (in_array($tools[$toolId]["env"], $toolsEnv) && $allow) {
//            return true;
//        }
//
//        return false;
//    }
//
//    /**
//     * Returns the list of all available Helium 10 tools depending on the environment
//     *
//     * @return array
//     * @throws Throwable
//     */
//    public static function getAvailableTools()
//    {
//        if ($availableTools) {
//            return $availableTools;
//        }
//
//        $uses = getAllUses();
//        $tools = Yii::$app->params["tools"];
//        $plansOptions = array_merge(
//                getAllPlansOptions(PLANS_PERIOD_MONTHLY),
//            getAllBundlesOptions(PLANS_PERIOD_MONTHLY)
//        );
//        $plans = array_filter($plansOptions, function ($planInfo) {
//        return $planInfo["type"] === "plan";
//    });
//
//        $availableTools = [];
//
//        foreach ($tools as $toolId => $toolOptions) {
//        if (!checkToolAvailability($toolId)) {
//            continue;
//        }
//
//        $usesNotSet = 0;
//        foreach (array_keys($plans) as $planId) {
//            if (!isset($uses[$planId][$toolId])) {
//                $usesNotSet++;
//            }
//        }
//        if ($usesNotSet > 1) {
//            continue;
//        }
//
//        $plansCount = 0;
//        $usesIsNull = 0;
//        foreach (array_keys($plans) as $planId) {
//            $plansCount++;
//            if (
//                    isset($uses[$planId][$toolId])
//                            && $uses[$planId][$toolId]["type"] == "uses"
//                            && $uses[$planId][$toolId]["value"] == 0
//            ) {
//                $usesIsNull++;
//            }
//        }
//        if ($usesIsNull > 0 && $usesIsNull == $plansCount) {
//            continue;
//        }
//
//        $availableTools[$toolId] = $toolOptions;
//    }
//
//        $availableTools = $availableTools;
//
//        return $availableTools;
//    }
//
//    /**
//     * Get the list of tools available for A La Carte Plan of Account
//     *
//     * @param $subscriptionPlans
//     * @param $isALaCarte
//     * @param $isAnnual
//     * @return array
//     * @throws Throwable
//     */
//    public static function getALaCarteAvailableTools($subscriptionPlans, $isALaCarte, $isAnnual)
//    {
//        $availableTools = PlansHelper::getAvailableTools();
//
//        if ($isALaCarte) {
//            foreach ($availableTools as $toolId => $toolOptions) {
//                $key = $isAnnual ? "aLaCarteAnnualPlanId" : "aLaCartePlanId";
//                $legacyKey = $isAnnual ? "legacyALaCarteAnnualPlanId" : "legacyALaCartePlanId";
//
//                if (
//                        !empty($toolOptions[$key])
//                                && !in_array(PlansMapHelper::getStripePlanId($toolOptions[$key]), $subscriptionPlans)
//                    && !in_array(PlansMapHelper::getStripePlanId($toolOptions[$legacyKey]), $subscriptionPlans)
//                ) {
//                    unset($availableTools[$toolId]);
//                }
//            }
//        }
//
//        return $availableTools;
//    }
//
//    /**
//     * @param string $couponId
//     * @return array
//     */
//    public static function getCouponsData($couponId)
//    {
//        if (!$couponId || !CouponHelper::isCouponAvailable($couponId)) {
//        return [];
//    }
//
//        $cacheKey = "coupon-data-4-" . $couponId;
//        if (Yii::$app->cache->exists($cacheKey)) {
//        return Yii::$app->cache->get($cacheKey);
//    }
//        $couponsData = [];
//        $couponsList[] = $couponId;
//        if (stripos($couponId, "_ANNUAL") === false) {
//            $couponsList[] = $couponId . "_ANNUAL";
//        } else {
//            $couponsList[] = str_replace("_ANNUAL", "", $couponId);
//        }
//        $prevCouponId = "";
//        foreach ($couponsList as $coupon_id) {
//        try {
//            $coupon = Coupon::retrieve($coupon_id);
//            $availablePlans = getAvailablePlans($coupon, stripos($coupon_id, "_ANNUAL"));
//            $couponsData[$coupon_id] = [
//            "id" => $coupon->id,
//                    "amount_off" => $coupon->amount_off,
//                    "percent_off" => $coupon->percent_off,
//                    "duration" => $coupon->duration,
//                    "duration_in_months" => $coupon->duration_in_months,
//                    "valid" => $coupon->valid,
//                    "created" => $coupon->created,
//                    "availablePlans" => $availablePlans,
//                ];
//            $prevCouponId = $coupon_id;
//        } catch (Exception $exception) {
//            if (isset($coupon) && isset($couponsData[$prevCouponId])) {
//                $availablePlans = getAvailablePlans($coupon, stripos($coupon_id, "_ANNUAL"));
//                $couponsData[$prevCouponId]["availablePlans"] =
//                        ArrayHelper::merge($couponsData[$prevCouponId]["availablePlans"], $availablePlans);
//            }
//        }
//    }
//        if ($couponsData) {
//            Yii::$app->cache->set($cacheKey, $couponsData, 86400);
//        }
//
//        return $couponsData;
//    }
//
//    /**
//     * Return the list of plans which is available to apply coupon
//     * @param $couponData
//     * @param $isAnnual
//     * @return array
//     */
//    public static function getAvailablePlans($couponData, $isAnnual)
//    {
//        $heliumPlans = array_merge(
//                getAllPlansOptions($isAnnual ? PLANS_PERIOD_ANNUAL : PLANS_PERIOD_MONTHLY),
//            getAllBundlesOptions($isAnnual ? PLANS_PERIOD_ANNUAL : PLANS_PERIOD_MONTHLY),
//        );
//        if (isset($heliumPlans[PlansHelper::HELIUM10_FREE_PLAN])) {
//            unset($heliumPlans[PlansHelper::HELIUM10_FREE_PLAN]);
//        }
//
//        // Prevent $ off coupons for a la carte
//        if (
//                (is_array($couponData) && $couponData["amount_off"])
//                        || (is_object($couponData) && $couponData->amount_off)
//        ) {
//            if (isset($heliumPlans[HELIUM10_A_LA_CARTE_PLAN])) {
//                unset($heliumPlans[HELIUM10_A_LA_CARTE_PLAN]);
//            }
//            if (isset($heliumPlans[HELIUM10_A_LA_CARTE_ANNUAL_PLAN])) {
//                unset($heliumPlans[HELIUM10_A_LA_CARTE_ANNUAL_PLAN]);
//            }
//        }
//
//        // Prevent coupons created before 4/6/2021 from working for Starter plans
//        if (!couponFitsToStarterPlan($couponData)) {
//        foreach (HELIUM10_STARTER_PLANS as $starterPLan) {
//            if (isset($heliumPlans[$starterPLan])) {
//                unset($heliumPlans[$starterPLan]);
//            }
//        }
//    }
//
//        $availablePlans = array_filter(
//                array_keys($heliumPlans),
//                fn(string $heliumPlanId) => !in_array($heliumPlanId, StripeHelper::PLANS_WITHOUT_DISCOUNTS, true)
//        );
//
//        // Prevent applying some special coupons
//        $checkSpecialCouponId = $couponData["id"];
//        if (stripos($couponData["id"], "_ANNUAL")) {
//            $checkSpecialCouponId = str_ireplace("_ANNUAL", "", $couponData["id"]);
//        }
//        foreach ($specialCoupons as $pattern => $plans) {
//        if (preg_match("@^" . $pattern . "$@si", $checkSpecialCouponId)) {
//            $availablePlans = $plans;
//            break;
//        }
//    }
//
//        $availablePlansFromDb = getAvailablePlansFromDb($couponData["id"]);
//        $availablePlans = $availablePlansFromDb ?: $availablePlans;
//
//        // Prevent less than $0 charges
//        if ($couponData["amount_off"]) {
//            $stripePlanIds = [];
//            foreach ($availablePlans as $availablePlanId) {
//                $stripePlanIds[] = PlansMapHelper::H10_TO_STRIPE[$availablePlanId] ?? $availablePlanId;
//            }
//
//            $stripePlans = StripePlan::find()->where(["in", "id", $stripePlanIds])->all();
//            foreach ($stripePlans as $stripePlan) {
//                /** @var StripePlan $stripePlan */
//                if ($stripePlan->amount < $couponData["amount_off"]) {
//                    $heliumPlanId = PlansMapHelper::STRIPE_TO_H10[$stripePlan->id] ?? $stripePlan->id;
//                    if (in_array($heliumPlanId, $availablePlans)) {
//                        unset($availablePlans[array_search($heliumPlanId, $availablePlans)]);
//                    }
//                }
//            }
//        }
//
//        return array_values($availablePlans);
//    }
//
//    /**
//     * @param Account $account
//     * @return string
//     */
//    public static function getPlanIdOfAccount(Account $account): string
//    {
//        return $account->getSubscriptionPlan();
//    }
//
//    /**
//     * @param array|Coupon $coupon
//     * @return bool
//     */
//    private static function couponFitsToStarterPlan($coupon): bool
//    {
//        return $coupon["created"] >= strtotime(STARTER_PLAN_RELEASE_DATE);
//    }
//
//    /**
//     * Returns coupon"s available plans from DB
//     * @param string $couponId
//     * @return array
//     */
//    protected static function getAvailablePlansFromDb(string $couponId): array
//    {
//        $result = [];
//
//        $model = StripeCoupon::find()
//            ->select([
//            "applies_to",
//            "availablePlans",
//            ])
//            ->where([
//            "id" => $couponId,
//            "valid" => true,
//            ])
//            ->andWhere([
//            "or",
//                ["disabled" => false],
//                ["is", "disabled", new Expression("null")],
//            ])
//            ->andWhere([
//            "or",
//                ["deleted" => false],
//                ["is", "deleted", new Expression("null")],
//            ])
//            ->asArray()
//            ->one();
//
//        if ($model) {
//            $availableProducts = Json::decode($model["applies_to"], true) ?? [];
//            $availablePlans = Json::decode($model["availablePlans"], true) ?? [];
//            $products = $availableProducts ?: $availablePlans;
//            if ($products) {
//                $stripePlanIds = StripePlan::find()
//                        ->select(["id"])
//                    ->where([
//                        "product" => $products,
//                        "active" => true,
//                    ])
//                    ->asArray()
//                    ->column();
//                foreach ($stripePlanIds as $stripePlanId) {
//                    $result[] = PlansMapHelper::getHeliumPlanId($stripePlanId);
//                }
//            }
//        }
//
//        return $result;
//    }
//
//    /**
//     * Returns the list of all A La Carte plans
//     * @return array<string, array>
//     */
//    public static function getALaCartePlans(bool $withLegacy = true): array
//    {
//        $tools = Yii::$app->params["tools"];
//        $plans = [];
//        $annualPlans = [];
//        foreach ($tools as $toolOptions) {
//        if (!empty($toolOptions["aLaCartePlanId"])) {
//            $plans[] = PlansMapHelper::getStripePlanId($toolOptions["aLaCartePlanId"]);
//        }
//        if ($withLegacy && !empty($toolOptions["legacyALaCartePlanId"])) {
//            $plans[] = PlansMapHelper::getStripePlanId($toolOptions["legacyALaCartePlanId"]);
//        }
//        if (!empty($toolOptions["aLaCarteAnnualPlanId"])) {
//            $annualPlans[] = PlansMapHelper::getStripePlanId($toolOptions["aLaCarteAnnualPlanId"]);
//        }
//        if ($withLegacy && !empty($toolOptions["legacyALaCarteAnnualPlanId"])) {
//            $annualPlans[] = PlansMapHelper::getStripePlanId($toolOptions["legacyALaCarteAnnualPlanId"]);
//        }
//    }
//        return ["plans" => $plans, "annualPlans" => $annualPlans];
//    }
//
//    /**
//     * @param string $couponId
//     * @param string|null $period
//     * @param int|null $accountId
//     * @return array<string, mixed>
//     */
//    public static function checkCoupon(string $couponId, ?string $period, ?int $accountId = null): array
//    {
//        $exceptList = ["TestIDev"];
//        $couponId = trim($couponId);
//
//        if (!in_array($couponId, $exceptList)) {
//            $couponId = strtoupper($couponId);
//            $initialCouponId = $couponId;
//        } else {
//            $initialCouponId = $couponId;
//        }
//
//        if (stripos($couponId, "_ANNUAL") === false) {
//            $annualCouponId = $couponId . "_ANNUAL";
//        } else {
//            $annualCouponId = $couponId;
//            $couponId = str_replace("_ANNUAL", "", $couponId);
//        }
//
//        try {
//            if ($accountId) {
//                $initialCouponData = StripeCoupon::findOne($initialCouponId);
//                $couponHoldbackResult = CouponHelper::checkHoldback($accountId, $initialCouponData);
//
//                if ($couponHoldbackResult) {
//                    return $couponHoldbackResult;
//                }
//            }
//
//            $coupon = $period === "month" ? $couponId : $annualCouponId;
//
//            $couponsData = getCouponsData($coupon);
//
//            if (!$couponsData) {
//                return ["status" => "error", "errMsg" => "Coupon not found. Note that coupon code is case-sensitive."];
//            }
//
//            return [
//            "status" => "success",
//                    "couponsData" => $couponsData,
//            ];
//        } catch (Exception $e) {
//            Yii::error($e->getMessage(), "user/apply-coupon");
//
//            return ["status" => "error", "errMsg" => YII_DEBUG ? $e->getTraceAsString() : "Unknown error"];
//        }
//    }
//
//    /**
//     * @param $couponId
//     * @param array $couponsData
//     * @return array
//     */
//    public static function getAvailablePlansForCoupon($couponId, $couponsData = [])
//    {
//        $couponId = strtoupper(trim($couponId));
//
//        if (!$couponsData) {
//            $couponsData = getCouponsData($couponId);
//        }
//
//        if (!$couponsData) {
//            return [];
//        }
//
//        // Make available % coupons for all plans and $ coupons for all except A La Carte
//        $availablePlans = [];
//        foreach ($couponsData as $id => $couponData) {
//        if ($id === $couponId) {
//            $isAnnual = false;
//        } else {
//            $isAnnual = true;
//        }
//        $availablePlans[$id] = getAvailablePlans($couponData, $isAnnual);
//    }
//
//        return $availablePlans;
//    }
//
//    /**
//     * Comparing arrays
//     * @param $array1
//     * @param $array2
//     * @return bool
//     */
//    public static function arrayEqual($array1, $array2): bool
//    {
//        return (
//                is_array($array1)
//                        && is_array($array2)
//                        && count($array1) === count($array2)
//                        && array_diff($array1, $array2) === array_diff($array2, $array1)
//        );
//    }
//
//    /**
//     * Compares arrays recursively
//     * @param array|null $array1
//     * @param array|null $array2
//     * @return bool
//     */
//    public static function arrayEqualRecursive(?array $array1, ?array $array2): bool
//    {
//        return is_array($array1)
//                && is_array($array2)
//                && count($array1) === count($array2)
//                && ArrayToolsHelper::arrayDiffRecursive($array1, $array2)
//                === ArrayToolsHelper::arrayDiffRecursive($array2, $array1);
//    }
//

    /**
     *
     */
    public String getBasePlanForEnterprisePlan(String enterprisePlanId) {
        String cacheKey = "enterprise:base-plan:" + enterprisePlanId;
        String basePlan = redisService.getKey(cacheKey);
        if (ObjectUtils.isNotEmpty(basePlan)) {
            return basePlan;
        }
        StripePlan stripePlan = stripePlanMapper.selectOneById(enterprisePlanId);
        if (ObjectUtils.isNotEmpty(stripePlan)) {
            redisService.setIfAbsentWithExpire(cacheKey, stripePlan.getBasePlan(), 1, TimeUnit.DAYS);
            return stripePlan.getBasePlan();
        }
        return PlansHelper.HELIUM10_FREE_PLAN;
    }
//
//    /**
//     * Checks if there should be used Chinese plans depending on the user"s geolocation or specified country ISO code
//     *
//     * @param string|null $countryIsoCode
//     * @param User|null $user
//     * @return bool
//     * @throws Throwable
//     */
//    public static function isChinesePlans(?string $countryIsoCode = null, ?User $user = null): bool
//    {
//        static $seesNewPlans;
//
//        if (!isset($seesNewPlans)) {
//            $currentUserId = Yii::$container->get(CurrentUserManager::class)->getUserId();
//
//            if ($currentUserId && $currentUserId === $user?->id) {
//                $seesNewPlans = Yii::$container->get(NewPlansService::class)->seesNewPlans();
//            }
//        }
//
//        if (!empty($seesNewPlans)) {
//            return false;
//        }
//
//        if ($countryIsoCode) {
//            return in_array($countryIsoCode, CHINESE_PLANS_COUNTRIES, true);
//        }
//
//        return AccountHelper::isChinese($user);
//    }
//
//    /**
//     * Checks if there should be used Chinese plans depending on the passed helium plan ID.
//     * If the plan ID is free, it will try to check it by the user"s geolocation or specified country ISO code.
//     *
//     * @param string $heliumPlanId
//     * @param string|null $countryIsoCode
//     * @param User|null $user
//     * @return bool
//     * @throws Throwable
//     */
//    public static function isChinesePlansByPlanId(
//            string $heliumPlanId,
//            ?string $countryIsoCode = null,
//            ?User $user = null
//    ): bool {
//        if ($heliumPlanId === HELIUM10_FREE_PLAN) {
//            return isChinesePlans($countryIsoCode, $user);
//        }
//
//        $cnPlansList = array_merge(
//                array_keys(Yii::$app->params["plansOptionsCn"]),
//        array_keys(Yii::$app->params["annualPlansCn"])
//        );
//
//        if (in_array($heliumPlanId, $cnPlansList, true)) {
//            return true;
//        }
//
//        // Handle Enterprise plans
//        if (strpos($heliumPlanId, "price_") !== false) {
//            $stripePlan = (new StripePlanHashesStorage())->get($heliumPlanId);
//            $basePlan = $stripePlan["basePlan"] ?? null;
//
//            return in_array($basePlan, $cnPlansList, true);
//        }
//
//        return false;
//    }
//
//    /**
//     * @param string $paramKey
//     * @param string $paramCnKey
//     * @param string|null $countryIsoCode
//     * @param User|null $user
//     * @return array
//     * @throws Throwable
//     */
//    private static function getPlansOptionsFromParams(
//            string $paramKey,
//            string $paramCnKey,
//            ?string $countryIsoCode = null,
//            ?User $user = null
//    ): array {
//        $isChinesePlans = isChinesePlans($countryIsoCode, $user);
//        $freeChinesePlan = $isChinesePlans && $paramCnKey === "plansOptionsCn"
//                ? [HELIUM10_FREE_PLAN => Yii::$app->params["plansOptions"][HELIUM10_FREE_PLAN]]
//            : [];
//
//        return $isChinesePlans ? $freeChinesePlan + Yii::$app->params[$paramCnKey] : Yii::$app->params[$paramKey];
//    }
//
//    /**
//     * Returns plans options depending on the user"s geolocation or specified country ISO code
//     *
//     * @param string|null $countryIsoCode
//     * @param User|null $user
//     * @return array
//     * @throws Exception
//     */
//    public static function getPlansOptions(?string $countryIsoCode = null, ?User $user = null): array
//    {
//        return getPlansOptionsFromParams("plansOptions", "plansOptionsCn", $countryIsoCode, $user);
//    }
//
//    /**
//     * Returns annual plans options depending on the user"s geolocation or specified country ISO code
//     *
//     * @param string|null $countryIsoCode
//     * @param User|null $user
//     * @return array
//     * @throws Exception
//     */
//    public static function getAnnualPlansOptions(?string $countryIsoCode = null, ?User $user = null): array
//    {
//        return getPlansOptionsFromParams("annualPlans", "annualPlansCn", $countryIsoCode, $user);
//    }
//
//    /**
//     * Returns current plans options depending on passed Helium plan ID.
//     * If the plan ID is free, it will try to get the plans options depending on the user"s geolocation or specified
//     * country ISO code.
//     *
//     * @param string $heliumPlanId
//     * @param string|null $countryIsoCode
//     * @param User|null $user
//     * @return array
//     * @throws Throwable
//     */
//    public static function getPlansOptionsByPlanId(
//            string $heliumPlanId,
//            ?string $countryIsoCode = null,
//            ?User $user = null
//    ): array {
//        if ($heliumPlanId === HELIUM10_FREE_PLAN) {
//            return getPlansOptions($countryIsoCode, $user);
//        }
//
//        if (isChinesePlansByPlanId($heliumPlanId, $countryIsoCode, $user)) {
//            return [HELIUM10_FREE_PLAN => Yii::$app->params["plansOptions"][HELIUM10_FREE_PLAN]]
//            + Yii::$app->params["plansOptionsCn"];
//        }
//
//        return Yii::$app->params["plansOptions"];
//    }
//
//    /**
//     * Returns current annual plans options depending on passed Helium plan ID.
//     * If the plan ID is free, it will try to get the plans options depending on the user"s geolocation or specified
//     * country ISO code.
//     *
//     * @param string $heliumPlanId
//     * @param string|null $countryIsoCode
//     * @param User|null $user
//     * @return array
//     * @throws Throwable
//     */
//    public static function getAnnualPlansOptionsByPlanId(
//            string $heliumPlanId,
//            ?string $countryIsoCode = null,
//            ?User $user = null
//    ): array {
//        if ($heliumPlanId === HELIUM10_FREE_PLAN) {
//            return getAnnualPlansOptions($countryIsoCode, $user);
//        }
//
//        if (isChinesePlansByPlanId($heliumPlanId, $countryIsoCode, $user)) {
//            return Yii::$app->params["annualPlansCn"];
//        }
//
//        return Yii::$app->params["annualPlans"];
//    }
//
//    /**
//     * Returns legacy plans options depending on passed Helium plan ID
//     * @param string $heliumPlanId
//     * @param string $period
//     * @return array
//     */
//    public static function getPlansOptionsLegacyByPlanId(string $heliumPlanId, string $period): array
//    {
//        checkPlansOptionsPeriod($period);
//
//        if (
//                array_key_exists($heliumPlanId, Yii::$app->params["plansOptionsCn"])
//            || array_key_exists($heliumPlanId, Yii::$app->params["annualPlansCn"])
//        ) {
//        return [];
//    }
//
//        return Yii::$app->params["legacyPlans"][$period];
//    }
//
//    /**
//     * Returns all available plans options regardless of the user"s geolocation
//     * @param string $period
//     * @return array
//     */
//    public static function getAllPlansOptions(string $period): array
//    {
//        checkPlansOptionsPeriod($period);
//
//        $plansOptions = [];
//
//        foreach (PLANS_OPTIONS_PERIODS_MAP[$period] as $plansOptionsKey) {
//        $plansOptions += Yii::$app->params[$plansOptionsKey];
//    }
//
//        return $plansOptions;
//    }
//
//    /**
//     * @param bool $withLegacy
//     * @return array
//     */
//    public static function getAllPeriodsPlansOptions(bool $withLegacy = false): array
//    {
//        $plansOptions = [];
//
//        foreach (PLANS_PERIODS as $period) {
//        if (!empty(PLANS_OPTIONS_PERIODS_MAP[$period])) {
//            foreach (PLANS_OPTIONS_PERIODS_MAP[$period] as $plansOptionsKey) {
//                $plansOptions += Yii::$app->params[$plansOptionsKey];
//            }
//        }
//    }
//
//        if ($withLegacy) {
//            foreach (PLANS_PERIODS as $period) {
//                $periodLegacyPlans = Yii::$app->params["legacyPlans"][$period] ?? [];
//
//                foreach ($periodLegacyPlans as $planId => $planOptions) {
//                    $plansOptions += [$planId => $planOptions];
//                }
//            }
//        }
//
//        return $plansOptions;
//    }
//
//    /**
//     * Returns all available legacy plans options regardless of the user"s geolocation
//     * @param string $period
//     * @return array
//     */
//    public static function getAllPlansOptionsLegacy(string $period): array
//    {
//        checkPlansOptionsPeriod($period);
//
//        return Yii::$app->params["legacyPlans"][$period];
//    }
//
//    /**
//     * Checks if a specified period is available
//     * @param string $period
//     * @return void
//     */
//    private static function checkPlansOptionsPeriod(string $period): void
//    {
//        if (!array_key_exists($period, PLANS_OPTIONS_PERIODS_MAP)) {
//            throw new InvalidArgumentException("Invalid period for plans options");
//        }
//    }
//
//    /**
//     * @param string $heliumPlanId
//     * @param array $planItems
//     * @return array
//     */
//    public static function filterALaCartePlanItems(string $heliumPlanId, array $planItems): array
//    {
//        if (!in_array($heliumPlanId, HELIUM10_A_LA_CARTE_PLANS, true)) {
//            throw new InvalidArgumentException("Invalid A La Carte Plan");
//        }
//
//        if (isset(Yii::$app->params["plansOptions"][$heliumPlanId])) {
//        $period = "month";
//    } elseif (isset(Yii::$app->params["annualPlans"][$heliumPlanId])) {
//        $period = "year";
//    } else {
//        throw new InvalidArgumentException("Invalid Plan");
//    }
//
//        $aLaCartePlans = getALaCartePlans();
//        foreach ($planItems as $key => $planItem) {
//        if ($period === "month" && !in_array($planItem, $aLaCartePlans["plans"], true)) {
//            unset($planItems[$key]);
//        } elseif ($period === "year" && !in_array($planItem, $aLaCartePlans["annualPlans"], true)) {
//            unset($planItems[$key]);
//        }
//    }
//
//        return $planItems;
//    }
//
//    /**
//     * @return bool
//     */
//    public static function hasDiamondPlan(): bool
//    {
//        /** @var Account $account */
//        $account = Yii::$app->user->account;
//        $currentPlanId = $account->getSubscriptionPlan(false, true);
//
//        return in_array($currentPlanId, HELIUM10_DIAMOND_PLANS, true);
//    }
//
//    /**
//     * @return bool
//     */
//    public static function hasElitePlan(): bool
//    {
//        /** @var Account $account */
//        $account = Yii::$app->user->account;
//        $currentPlanId = $account->getSubscriptionPlan(false, true);
//
//        return in_array($currentPlanId, HELIUM10_ELITE_PLANS, true);
//    }
//
//    /**
//     * @param string $heliumPlanId
//     * @return string
//     */
//    public static function getPlanIntervalType(string $heliumPlanId): string
//    {
//        if ($heliumPlanId === HELIUM10_FREE_PLAN) {
//            return "free";
//        }
//
//        $plansOptions = array_merge(
//                getAllPlansOptions(PLANS_PERIOD_MONTHLY),
//            getAllPlansOptionsLegacy(PLANS_PERIOD_MONTHLY),
//            getAllBundlesOptions(PLANS_PERIOD_MONTHLY)
//        );
//
//        if (array_key_exists($heliumPlanId, $plansOptions)) {
//            return $plansOptions[$heliumPlanId]["intervalCount"] === PLANS_INTERVAL_COUNT_3
//                    ? PLANS_PERIOD_QUARTERLY
//                    : PLANS_PERIOD_MONTHLY;
//        }
//
//        $annualPlans = array_merge(
//                getAllPlansOptions(PLANS_PERIOD_ANNUAL),
//            getAllPlansOptionsLegacy(PLANS_PERIOD_ANNUAL),
//            getAllBundlesOptions(PLANS_PERIOD_ANNUAL)
//        );
//
//        if (array_key_exists($heliumPlanId, $annualPlans)) {
//            return PLANS_PERIOD_ANNUAL;
//        }
//
//        throw new InvalidArgumentException("Invalid Helium10 Plan ID");
//    }
//
//    /**
//     * @param string $heliumPlanId
//     * @return string
//     */
//    public static function getPlanIntervalShortType(string $heliumPlanId): string
//    {
//        return match (getPlanIntervalType($heliumPlanId)) {
//        PLANS_PERIOD_QUARTERLY => PLANS_PERIOD_QUARTERLY_SHORT,
//                PLANS_PERIOD_ANNUAL => PLANS_PERIOD_ANNUAL_SHORT,
//        default => PLANS_PERIOD_MONTHLY_SHORT,
//    };
//    }
//
//    /**
//     * @param string $longInterval
//     * @param int $intervalCount
//     * @return string
//     */
//    public static function getShortIntervalType(string $longInterval, int $intervalCount = 1): string
//    {
//        return match ($longInterval) {
//        PLANS_INTERVAL_YEAR => PLANS_PERIOD_ANNUAL_SHORT,
//                PLANS_INTERVAL_MONTH => match ($intervalCount) {
//            PLANS_INTERVAL_COUNT_3 => PLANS_PERIOD_QUARTERLY_SHORT,
//            default => PLANS_PERIOD_MONTHLY_SHORT,
//        },
//        default => PLANS_PERIOD_MONTHLY_SHORT,
//    };
//    }
//
//    /**
//     * Returns all available quarter plans options regardless of the user"s geolocation
//     * @return array
//     */
//    public static function getAllQuarterPlansOptions(): array
//    {
//        $plansOptions = array_merge(
//                getAllPlansOptions(PLANS_PERIOD_MONTHLY),
//            getAllPlansOptionsLegacy(PLANS_PERIOD_MONTHLY)
//        );
//
//        return filterQuarterPlans($plansOptions);
//    }
//
//    /**
//     * Returns an array of quarter plans from the list of passed plans options.
//     * @param array $plansOptions
//     * @return array
//     */
//    protected static function filterQuarterPlans(array $plansOptions): array
//    {
//        $result = [];
//
//        foreach ($plansOptions as $heliumPlanId => $planData) {
//        $isQuarterPlan = $planData["interval"] === PLANS_INTERVAL_MONTH
//                && $planData["intervalCount"] === PLANS_INTERVAL_COUNT_3;
//
//        if ($isQuarterPlan) {
//            $result[$heliumPlanId] = $planData;
//        }
//    }
//
//        return $result;
//    }
//
//    /**
//     * Returns current quarter plans options depending on the passed Helium plan ID.
//     * If the plan ID is free, it will try to get the plans options depending on the user"s geolocation or the specified
//     * country ISO code.
//     *
//     * @param string $heliumPlanId
//     * @param string|null $countryIsoCode
//     * @param User|null $user
//     * @return array
//     * @throws Exception
//     */
//    public static function getQuarterPlansOptionsByPlanId(
//            string $heliumPlanId,
//            ?string $countryIsoCode = null,
//            ?User $user = null
//    ): array {
//        $plansOptions = getPlansOptionsByPlanId($heliumPlanId, $countryIsoCode, $user);
//
//        return filterQuarterPlans($plansOptions);
//    }
//
//    /**
//     * Returns the account plan"s "intervalCount" value.
//     * For an enterprise plan, it returns the "interval_count" value from the StripePLan table.
//     *
//     * @param Account $account
//     * @return int|null
//     */
//    public static function getAccountPlanIntervalCount(Account $account): ?int
//    {
//        $plansOptions = array_merge(
//                getAllPlansOptions(PLANS_PERIOD_MONTHLY),
//            getAllPlansOptions(PLANS_PERIOD_ANNUAL),
//            getAllPlansOptionsLegacy(PLANS_PERIOD_MONTHLY),
//            getAllPlansOptionsLegacy(PLANS_PERIOD_ANNUAL),
//            getAllBundlesOptions()
//        );
//
//        $planId = $account->getSubscriptionPlan() === HELIUM10_ENTERPRISE_PRODUCT
//                ? $account->stripeSubscription->plan_id
//                : $account->getSubscriptionPlan(false, true);
//
//        // Handle regular plans
//        if (array_key_exists($planId, $plansOptions)) {
//            return $plansOptions[$planId]["intervalCount"];
//        }
//
//        // Handle Enterprise plans
//        if (str_contains($planId, "price_")) {
//            $stripePlan = (new StripePlanHashesStorage())->get($planId);
//
//            return $stripePlan["interval_count"] ?? null;
//        }
//
//        return null;
//    }
//
//    /**
//     * Returns back source array of plans without items, which are hidden for specific user roles.
//     *
//     * @param array $plansToFilter
//     * @param array $keepPlans
//     * @param bool $isAdminPanel
//     * @return array
//     * @throws Exception
//     */
//    public static function filterH10PlansHiddenByUserRoles(
//            array $plansToFilter,
//            array $keepPlans = [],
//            bool $isAdminPanel = false
//    ): array {
//        return Yii::$container->get(NewPlansService::class)->filterH10PlansHiddenByUserRoles(
//                $plansToFilter,
//                $keepPlans,
//                $isAdminPanel
//        );
//    }
//
//    /**
//     * Returns back formatted plan display name.
//     *
//     * @param string $planId
//     * @return string|null
//     * @throws Exception
//     */
//    public static function getTitleById(string $planId): ?string
//    {
//        return Yii::$container->get(PlansService::class)->getTitleById($planId);
//    }
//
//    /**
//     * Returns available FollowUp options
//     * @return array
//     */
//    public static function getAllFollowUpOptions(): array
//    {
//        return Yii::$app->params["extraPlans"]["followup"];
//    }
//
//    /**
//     * Checks if a specified period is available
//     * @param string $period
//     * @return void
//     */
//    private static function checkBundlesOptionsPeriod(string $period): void
//    {
//        if (!array_key_exists($period, BUNDLES_OPTIONS_PERIODS_MAP)) {
//            throw new InvalidArgumentException("Invalid period for bundles options");
//        }
//    }
//
//    /**
//     * Returns available bundle options
//     * @param string|null $period
//     * @return array
//     */
//    public static function getAllBundlesOptions(?string $period = null): array
//    {
//        if ($period) {
//            checkBundlesOptionsPeriod($period);
//
//            $bundlesOptions = [];
//
//            foreach (BUNDLES_OPTIONS_PERIODS_MAP[$period] as $bundlesOptionsKey) {
//                $bundlesOptions += Yii::$app->params["bundles"][$bundlesOptionsKey];
//            }
//
//            return $bundlesOptions;
//        }
//
//        return array_merge(
//                Yii::$app->params["bundles"][PLANS_PERIOD_MONTHLY],
//            Yii::$app->params["bundles"][PLANS_PERIOD_ANNUAL]
//        );
//    }
}
