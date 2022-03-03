package com.example.demojenkins.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@Slf4j
public class ProductApi {
    @GetMapping
    public String getProducts() {
        return "In Product Api!!!!";
    }
}
