package com.demo.render.renderdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.render.renderdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
