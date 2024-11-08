package com.example.shardingsphere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "`order`")
@Data
public class Order {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "delivery_address")
    private String deliveryAddress;

}
