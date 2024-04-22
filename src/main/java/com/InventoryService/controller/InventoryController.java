package com.InventoryService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/inventory"})
public class InventoryController {

    @GetMapping("/health")
    public String getStatus() {
        return "Inventory Service is up & running!";
    }

}
