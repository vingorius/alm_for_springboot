package com.wellstek.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @GetMapping("/second")
    public String second() {
        return "Second Hello World!";
    }
}
