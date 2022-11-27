package com.ares.fag.fallback;

import com.ares.fag.micservice.Fulfillment;
import org.springframework.stereotype.Component;

@Component
public class Fallback implements Fulfillment {
    @Override
    public String hello() {
        return "hello降级";
    }
}
