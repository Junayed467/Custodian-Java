package com.example.custodian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @GetMapping
    public Map<String, Object> ok() {
        return Map.of(
                "status", "ok",
                "service", "custodian",
                "version", "0.0.1"
        );
    }
}
