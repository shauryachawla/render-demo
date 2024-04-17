package com.demo.render.renderdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.render.renderdemo.model.User;
import com.demo.render.renderdemo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User saveUser(User user) {
        User result = repository.save(user);
        return result;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public List<User> saveAll(List<User> users) {
        return repository.saveAll(users);
    }

    public void deleteUser(int id) {
        repository.deleteById(id);
    }

    public User getUser(int id) {
        return repository.findById(id).orElse(null);
    }

    public User addUser(User user) {
        return repository.save(user);
    }
}
