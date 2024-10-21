package com.pacvue.h10.customer.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.pacvue.h10.customer.api.domain.*.mapper")
@EnableFeignClients(basePackages = "com.pacvue.h10.customer.api")
public class CustomerApplication {
    public static void main(String[] args) {

        SpringApplication.run(CustomerApplication.class, args);

    }
}
