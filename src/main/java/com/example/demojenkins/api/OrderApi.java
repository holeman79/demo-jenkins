package com.example.demojenkins.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderss")
@Slf4j
public class OrderApi {
    @GetMapping
    public String getProducts() {
        return "In Order Api2222!!!!";
    }
}
