package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task8_2")
public class Task82_Discovery {

    @GetMapping("/register")
    public String register() {
        return "Services Registered in Eureka";
    }

    @GetMapping("/discover")
    public String discover() {
        return "Dynamic Service Lookup Successful";
    }
}