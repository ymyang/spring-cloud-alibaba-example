package org.example.feign;

public class TestFallback implements TestFeignClient {

    public String hello(String name) {
        return "null";
    }
}
