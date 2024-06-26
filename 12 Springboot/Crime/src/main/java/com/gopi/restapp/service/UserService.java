package com.gopi.restapp.service;

import com.gopi.restapp.model.User;

public interface UserService {
    User findByUserName(String usename);
    User saveUser(User user);
}
