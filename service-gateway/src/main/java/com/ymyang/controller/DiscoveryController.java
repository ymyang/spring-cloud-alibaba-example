package com.ymyang.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String index() {
        return "ok";
    }

    @SentinelResource("services")
    @GetMapping("/services")
    public Object services() {
        return discoveryClient.getServices();
    }

    @GetMapping("/services/{service}")
    public Object client(@PathVariable String service) {
        return discoveryClient.getInstances(service);
    }


}
