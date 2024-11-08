package com.example.shardingsphere.service;

import com.example.shardingsphere.entity.Order;
import com.example.shardingsphere.repository.OrderRepository;
import com.example.shardingsphere.service.Aop.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id)
                .orElse(null);
    }

    public Order getOrderCustomer(Long id) {
        return orderRepository.findByCustomerId(id);
    }

    @Master
    public Order getMasyerOrder(Long id) {
        return orderRepository.findById(id)
                .orElse(null);
    }
}
