package org.example.controller;

import org.example.feign.TestFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "TestApiController", tags = {"测试服务"})
@RestController
public class TestApiController {

    @Autowired
    private TestFeignClient testFeignClient;

    @ApiOperation(value = "hello", notes = "作者：xxx")
    @GetMapping("/hello")
    public String hello() {
        return testFeignClient.hello("Spring");
    }

}
