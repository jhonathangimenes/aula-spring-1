package com.example.aulaspring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aulaspring1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
