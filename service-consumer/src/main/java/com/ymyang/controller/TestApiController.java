package com.ymyang.controller;

import com.ymyang.feign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    @Autowired
    private TestFeignClient testFeignClient;

    @GetMapping("/hello")
    public String hello() {
        return testFeignClient.hello("Spring");
    }

}
