package com.example.aulaspring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aulaspring1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
