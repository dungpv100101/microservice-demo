package com.microservice.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {

    @GetMapping
    public String index() {
        return "Hello Inventory";
    }
}
