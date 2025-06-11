package com.sd101.history.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SimpleRESTController {

    @GetMapping("/rest/simple")
    public Map<String, Object> simpleAPI() {
        return Map.of("key", "value");
    }
}
