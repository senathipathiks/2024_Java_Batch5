package com.gopi.restapp.service;

import com.gopi.restapp.model.User;

public interface UserService {
    User findByEmail(String email);
    User saveUser(User user);
}
