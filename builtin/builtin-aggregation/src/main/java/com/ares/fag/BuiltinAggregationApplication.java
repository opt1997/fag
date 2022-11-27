package com.ares.fag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BuiltinAggregationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuiltinAggregationApplication.class, args);
    }

}
