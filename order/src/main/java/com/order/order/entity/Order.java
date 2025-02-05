package com.order.order.entity;


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
@Table(name = "order_table1")
public class Order {
    @Id
    private int id;
    private int itemId;
    private String orderDate;
    private int amount;
}
