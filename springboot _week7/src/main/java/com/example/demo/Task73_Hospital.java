package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task7_3")
public class Task73_Hospital {

    @GetMapping("/services")
    public String services() {
        return "Patient Service -> Patient DB\n" +
               "Doctor Service -> Doctor DB\n" +
               "Appointment Service -> Appointment DB";
    }
}