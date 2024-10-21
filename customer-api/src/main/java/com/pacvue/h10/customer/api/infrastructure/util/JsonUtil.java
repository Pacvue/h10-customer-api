package com.pacvue.h10.customer.api.infrastructure.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.util.StringUtils;

public class JsonUtil {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .registerModule(new JavaTimeModule());
    }

    public static String toJson(Object object) {
        if (null == object) {
            return null;
        }
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T fromJson(String jsonStr, Class<T> clazz) {
        if (!StringUtils.hasText(jsonStr)) {
            return null;
        }
        try {
            return OBJECT_MAPPER.readValue(jsonStr, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonNode fromJson(String jsonStr) {
        if (!StringUtils.hasText(jsonStr)) {
            return null;
        }
        try {
            return OBJECT_MAPPER.readTree(jsonStr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isJson(String jsonStr) {
        if (!StringUtils.hasText(jsonStr)) {
            return false;
        }
        if ((!jsonStr.startsWith("{") && !jsonStr.startsWith("}")) || (!jsonStr.startsWith("[") && !jsonStr.startsWith("]"))) {
            return false;
        }
        try {
            OBJECT_MAPPER.readTree(jsonStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
