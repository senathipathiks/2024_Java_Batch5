package com.boot.Ex.service;

import java.util.List;

import com.boot.Ex.model.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
    User addStudent(User user);
}




