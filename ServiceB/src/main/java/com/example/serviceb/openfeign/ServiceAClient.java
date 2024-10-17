package com.example.serviceb.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-a")
public interface ServiceAClient {
    @GetMapping("/say-hello")
    public String sayHello();
}
