package com.pacvue.h10.customer.api.infrastructure.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class EnvHelper {

    @Value("${YII_ENV}")
    private static String YII_ENV;
    @Value("${YII_BETA_TEST:false}")
    private static Boolean YII_BETA_TEST;
    @Value("${YII_ACCEPTANCE_TEST:false}")
    private static Boolean YII_ACCEPTANCE_TEST;

    /**
     * Returns environment tag
     *
     * @return string
     */
    public static String getEnvironmentTag() {
        List<String> local = Arrays.asList("dev", "test");
        if (local.contains(YII_ENV)) {
            return "local";
        }
        if (YII_BETA_TEST) {
            return "beta";
        }
        if (YII_ENV.equals("prod")) {
            return YII_ACCEPTANCE_TEST ? "alpha" : "prod";
        }
        return "unknown";
    }

    public static Boolean isLocalEnv() {
        String env = getEnvironmentTag();
        return env.equals("local");
    }
}
