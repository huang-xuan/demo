package com.example.shardingsphere.controller;

import com.example.shardingsphere.entity.Order;
import com.example.shardingsphere.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.createOrder(order));
    }

    @PostMapping("/get")
    public ResponseEntity<Order> getOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.getOrder(order.getOrderId()));
    }

    @PostMapping("/get/customer")
    public ResponseEntity<Order> getOrderCustomer(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.getOrderCustomer(order.getCustomerId()));
    }

    @PostMapping("/getMasterOrder")
    public ResponseEntity<Order> getMasterOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.getMasyerOrder(order.getOrderId()));
    }
}
