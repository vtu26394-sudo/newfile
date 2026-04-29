package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task8_5")
public class Task85_Communication {

    @GetMapping("/service1")
    public String service1() {
        return "Service1 calling Service2...";
    }

    @GetMapping("/service2")
    public String service2() {
        return "Response from Service2";
    }
}