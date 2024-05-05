package com.InventoryService.controller;

import com.InventoryService.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import com.InventoryService.model.Inventory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = {"/inventory"})
public class InventoryController {

    @Autowired
    public InventoryService service;

    @GetMapping("/health")
    public String getStatus() {
        return "Inventory Service is up & running!";
    }

    @GetMapping("/ispresent/{id}/{quantity}")
    public boolean isInventoryAvailable(@PathVariable  String id, @PathVariable Integer quantity) {
        return service.isInventoryAvailable(id, quantity);
    }

    @PostMapping("/create")
    public void isInventoryAvailable(@RequestBody Inventory invetory) {
         service.save(invetory);
    }
}