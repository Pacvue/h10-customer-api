package com.pacvue.h10.customer.api.infrastructure.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger3Config {

    @Bean
    public GroupedOpenApi UserApi() {
        return GroupedOpenApi.builder().group("user module").pathsToMatch("/user/**").build();
    }

    @Bean
    public GroupedOpenApi OtherApi() {
        return GroupedOpenApi.builder().group("other module").pathsToMatch("/other/**", "/others")
                .build();
    }

    @Bean
    public GroupedOpenApi HeatMap() {
        return GroupedOpenApi.builder().group("heat map").pathsToMatch("/heatMap/**").build();
    }

    @Bean
    public GroupedOpenApi PPC() {
        return GroupedOpenApi.builder().group("PPC").pathsToMatch("/ppc/**").build();
    }

    @Bean
    public OpenAPI docsOpenApi() {
        return new OpenAPI()
                .info(new Info().title("h10-backend-app")
                        .description("h10  backend rest api doc.")
                        .version("v1.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("www.pacvue.com")
                        .url("https://www.pacvue.com/"));
    }
}

