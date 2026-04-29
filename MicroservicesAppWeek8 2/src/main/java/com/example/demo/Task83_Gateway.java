package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task8_3")
public class Task83_Gateway {

    @GetMapping("/manual")
    public String manualRouting() {
        return "Manual Routing → Request to User Service";
    }

    @GetMapping("/auto")
    public String autoRouting() {
        return "Automatic Routing via API Gateway";
    }
}