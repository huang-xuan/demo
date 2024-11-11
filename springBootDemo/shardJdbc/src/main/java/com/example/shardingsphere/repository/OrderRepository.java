package com.example.shardingsphere.repository;

import com.example.shardingsphere.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByCustomerId(Long customerId);

}
