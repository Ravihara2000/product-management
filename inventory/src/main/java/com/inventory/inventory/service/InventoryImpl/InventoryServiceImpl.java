package com.inventory.inventory.service.InventoryImpl;

import com.inventory.inventory.dto.InventoryDto;
import com.inventory.inventory.entity.Inventory;
import com.inventory.inventory.repo.InventoryRepo;
import com.inventory.inventory.service.InventoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryRepo inventoryRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public InventoryDto addItem(InventoryDto inventoryDto) {
        Inventory inventory= modelMapper.map(inventoryDto,Inventory.class);
        inventoryRepo.save(inventory);
        return inventoryDto;
    }
}
