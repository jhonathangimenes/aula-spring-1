package com.example.aulaspring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aulaspring1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
