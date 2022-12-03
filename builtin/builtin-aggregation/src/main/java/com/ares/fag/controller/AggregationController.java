package com.ares.fag.controller;

import com.ares.fag.micservice.Fulfillment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aggregation/v1")
public class AggregationController {
    @Autowired
    Fulfillment fulfillment;

    @RequestMapping("/hello")
    public String hello() {
        return fulfillment.hello();
    }

    @RequestMapping("/hello/redis")
    public String helloRedis() {
        return "HELLO REDIS";
    }

    @RequestMapping("/hello/kafka")
    public String helloKafka() {
        return "HELLO KAFKA";
    }
}
