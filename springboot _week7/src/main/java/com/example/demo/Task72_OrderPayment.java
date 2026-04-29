package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task7_2")
public class Task72_OrderPayment {

    @PostMapping("/order")
    public String createOrder() {
        return "Order Created → Calling Payment Service...";
    }

    @PostMapping("/payment")
    public String payment() {
        return "Payment Successful → Order Confirmed";
    }
}