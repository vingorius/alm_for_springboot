package com.wellstek.demo;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    Random random = new SecureRandom(); // Sensitive use of Random
    byte[] bytes = new byte[20];

    @GetMapping("/second")
    public String second() {
        random.nextBytes(bytes); // Check if bytes is used for hashing, encryption, etc...
        return "Second Hello World!";
    }
}
