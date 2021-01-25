package com.ymyang.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Service is ok");
    }

    @GetMapping("/api/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable("name") String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
