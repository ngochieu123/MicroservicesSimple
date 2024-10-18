package com.example.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {
    @GetMapping("/say-hello")
    public String sayHello() {
        return "Response from Service A";
    }
}
