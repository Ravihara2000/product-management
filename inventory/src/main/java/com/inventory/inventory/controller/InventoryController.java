package com.inventory.inventory.controller;

import com.inventory.inventory.dto.InventoryDto;
import com.inventory.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    private InventoryDto addItem(@RequestBody InventoryDto inventoryDto){
        return inventoryService.addItem(inventoryDto);
    }
}
