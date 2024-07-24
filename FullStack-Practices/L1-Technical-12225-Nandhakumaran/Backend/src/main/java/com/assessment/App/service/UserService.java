package com.assessment.App.service;

import java.util.List;

import com.assessment.App.model.User;

public interface UserService {
	
    User getUserById(int id);
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser( User user); 
	List<User> getAllUsers();
}


