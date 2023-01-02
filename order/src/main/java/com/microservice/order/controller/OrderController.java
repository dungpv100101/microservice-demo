package com.microservice.order.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @GetMapping
    public String index() {
        return "Hello Order";
    }

    @GetMapping(value = "/healthCheck")
    public String healthCheck() {
        return "Good";
    }

    @GetMapping(value = "private")
    @PreAuthorize("hasRole('agent')")
    public String privatePage() {
        return "Private";
    }
}
