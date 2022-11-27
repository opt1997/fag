package com.ares.fag.micservice;

import com.ares.fag.fallback.Fallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "fulfillment", path = "/fulfillment/v1", fallback = Fallback.class)
public interface Fulfillment {
    @RequestMapping(path = "/hello", method = RequestMethod.POST)
    String hello();
}