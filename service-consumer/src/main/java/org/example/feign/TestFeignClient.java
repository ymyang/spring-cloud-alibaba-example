package org.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-provider")//, fallback = TestFallback.class)
public interface TestFeignClient {

    @GetMapping("/api/hello/{name}")
    String hello(@PathVariable("name") String name);
}
