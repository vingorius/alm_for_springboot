package com.wellstek.demo;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @SuppressWarnings("java:S2245")
    Random random = new Random(); // Sensitive use of Random
    byte[] bytes = new byte[20];

    @GetMapping("/second")
    public String second() {
        random.nextBytes(bytes); // Check if bytes is used for hashing, encryption, etc...
        return "Second Hello World!";
    }

    @GetMapping("/second2")
    public String second2() {
        random.nextBytes(bytes); // Check if bytes is used for hashing, encryption, etc...
        return "Second2 Hello World!";
    }
}
