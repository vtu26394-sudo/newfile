package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task8_1")
public class Task81_Eureka {

    @GetMapping("/server")
    public String server() {
        return "Eureka Server Running (Discovery-MS)";
    }

    @GetMapping("/clients")
    public String clients() {
        return "Registered Clients:\nUser-MS\nAccountMng-MS";
    }
}