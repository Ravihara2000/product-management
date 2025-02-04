package com.order.order.controller;

import com.order.order.dto.OrderDto;
import com.order.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/addOrder")
    private OrderDto saveOrder(@RequestBody OrderDto orderDto){
        return orderService.saveOrder(orderDto);
    }
    @GetMapping("/getOrderByID/{orderId}")
    private OrderDto getOrderById(@PathVariable Integer orderId){
        return orderService.getOrderById(orderId);
    }
@GetMapping("/getAllOrders")
    private List<OrderDto> getAllOrders(){
        return orderService.getAllOrders();
}
}
