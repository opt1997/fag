package com.ares.fulfillmentcore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fulfillment/v1")
public class FulfillmentController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello fulfillment";
    }
}
