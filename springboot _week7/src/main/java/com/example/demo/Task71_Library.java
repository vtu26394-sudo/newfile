package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task7_1")
public class Task71_Library {

    @GetMapping("/services")
    public String getServices() {
        return "User Service -> Manage users\n" +
               "Book Service -> Manage books\n" +
               "Borrow Service -> Issue/Return books\n" +
               "Fine Service -> Handle fines";
    }
}