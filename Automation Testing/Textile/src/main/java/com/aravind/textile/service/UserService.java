package com.aravind.textile.service;

import com.aravind.textile.model.User;

public interface UserService {

	public String addUser(User user);

	public User login(String username, String password);

}
