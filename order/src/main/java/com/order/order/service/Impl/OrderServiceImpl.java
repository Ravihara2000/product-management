package com.order.order.service.Impl;

import com.order.order.dto.OrderDto;
import com.order.order.entity.Order;
import com.order.order.repo.OrderRepo;
import com.order.order.service.OrderService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public OrderDto saveOrder(OrderDto orderDto) {
        orderRepo.save(modelMapper.map(orderDto, Order.class));
        return orderDto;
    }

    @Override
    public OrderDto getOrderById(Integer orderId) {
        Order order = orderRepo.getReferenceById(orderId);
        return modelMapper.map(order,OrderDto.class);
    }

    @Override
    public List<OrderDto> getAllOrders() {
        List<Order> orderList = orderRepo.findAll();
        return modelMapper.map(orderList, new TypeToken<List<OrderDto>>(){}.getType());
    }
}
