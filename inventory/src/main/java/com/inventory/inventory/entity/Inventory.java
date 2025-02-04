package com.inventory.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "inventory_table1")
public class Inventory {
    @Id
    private int id;
    private int itemId;
    private int quantity;
    private int productId;
}
