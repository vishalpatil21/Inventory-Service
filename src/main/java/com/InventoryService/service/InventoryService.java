package com.InventoryService.service;

import com.InventoryService.model.Inventory;
import com.InventoryService.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository repository;


    public boolean isInventoryAvailable(String id, Integer quantity) {

        Inventory inventory = repository.findById(id).get();

        if (quantity < inventory.getQuantity()) {
            return true;
        }
        return false;
    }

    public void save(Inventory invetory) {
       repository.save(invetory);
    }
}
