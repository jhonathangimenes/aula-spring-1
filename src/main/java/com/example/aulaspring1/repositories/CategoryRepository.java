package com.example.aulaspring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aulaspring1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}