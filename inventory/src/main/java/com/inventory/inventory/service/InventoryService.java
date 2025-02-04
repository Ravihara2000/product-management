package com.inventory.inventory.service;

import com.inventory.inventory.dto.InventoryDto;
import org.springframework.stereotype.Service;

@Service
public interface InventoryService {
    InventoryDto addItem(InventoryDto inventoryDto);
}
