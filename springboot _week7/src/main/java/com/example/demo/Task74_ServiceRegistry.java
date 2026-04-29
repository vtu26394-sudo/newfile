package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task7_4")
public class Task74_ServiceRegistry {

    @GetMapping("/registry")
    public String registry() {
        return "User Service registered\n" +
               "Product Service registered\n" +
               "Payment Service registered";
    }

    @GetMapping("/discover")
    public String discover() {
        return "User Service → discovering Product Service via registry";
    }
}