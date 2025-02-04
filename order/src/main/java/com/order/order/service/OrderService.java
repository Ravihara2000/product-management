package com.order.order.service;

import com.order.order.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    OrderDto saveOrder(OrderDto orderDto);

    OrderDto getOrderById(Integer orderId);


    List<OrderDto> getAllOrders();
}
