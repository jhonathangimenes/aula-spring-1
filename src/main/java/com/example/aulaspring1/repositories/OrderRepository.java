package com.example.aulaspring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aulaspring1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
