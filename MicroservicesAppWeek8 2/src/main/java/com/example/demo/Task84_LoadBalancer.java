package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.Random;

@RestController
@RequestMapping("/task8_4")
public class Task84_LoadBalancer {

    String[] instances = {"Instance 1", "Instance 2"};

    @GetMapping("/balance")
    public String balance() {
        Random r = new Random();
        return "Handled by: " + instances[r.nextInt(instances.length)];
    }
}