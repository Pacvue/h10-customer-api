package com.pacvue.h10.customer.api.infrastructure.constant;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

/**
 * 将constants-local.yml文件加载为Map
 */
public class ConstantLocalConfig {
    private static final Map<String, Object> config;

    static {
        Yaml yaml = new Yaml();
        try (InputStream input = ConstantLocalConfig.class.getClassLoader().getResourceAsStream("constants-local.yml")) {
            config = yaml.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Error loading application.yml", e);
        }
    }

    public static String getAdminEmail() {
        return (String) config.get("YII2_IO_API_INTERNAL_HOST");
    }
}
