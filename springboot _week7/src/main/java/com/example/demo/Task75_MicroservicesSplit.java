package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task7_5")
public class Task75_MicroservicesSplit {

    @GetMapping("/info")
    public String info() {
        return "Monolithic App → Split into:\n" +
               "User Service\n" +
               "Order Service\n" +
               "Payment Service\n" +
               "Each runs independently";
    }
}