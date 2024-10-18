package com.example.serviceb.controller;

import com.example.serviceb.openfeign.ServiceAClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {
    private final ServiceAClient serviceAClient;

    public ServiceBController(ServiceAClient serviceAClient) {
        this.serviceAClient = serviceAClient;
    }

    @GetMapping("/call-to-service-a")
    public String callToServiceA() {
        return serviceAClient.sayHello();
    }

}
