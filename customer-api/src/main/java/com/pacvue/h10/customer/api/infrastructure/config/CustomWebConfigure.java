package com.pacvue.h10.customer.api.infrastructure.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.util.List;


@Component
@RequiredArgsConstructor
public class CustomWebConfigure implements WebMvcConfigurer {

    private final ObjectMapper objectMapper;



    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // delete old mappingJackson2HttpMessageConverter
        converters.removeIf(httpMessageConverter -> httpMessageConverter instanceof MappingJackson2HttpMessageConverter);
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.addHandler(
                new DeserializationProblemHandler() {
                    @Override
                    public Object handleUnexpectedToken(
                            DeserializationContext ctxt,
                            JavaType targetType,
                            JsonToken t,
                            JsonParser p,
                            String failureMsg)
                            throws IOException {
                        if (targetType.getRawClass() == String.class
                                && (t == JsonToken.START_OBJECT || t == JsonToken.START_ARRAY)) {
                            return p.readValueAsTree().toString();
                        }
                        return super.handleUnexpectedToken(ctxt, targetType, t, p, failureMsg);
                    }
                });
        converter.setObjectMapper(objectMapper);
        converters.add(converter);
    }
}
