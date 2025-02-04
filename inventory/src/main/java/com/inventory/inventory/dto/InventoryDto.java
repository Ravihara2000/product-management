package com.inventory.inventory.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryDto {
        private int id;
        private int itemId;
        private int quantity;
        private int productId;
    }

