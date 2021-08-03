package com.ymyang.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "TestController", tags = {"测试服务"})
@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Service is ok");
    }

    @ApiOperation(value = "hello", notes = "作者：xxx")
    @GetMapping("/api/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable("name") String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
