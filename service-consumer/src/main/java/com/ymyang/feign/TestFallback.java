package com.ymyang.feign;

public class TestFallback implements TestFeignClient {

    public String hello(String name) {
        return "null";
    }
}
