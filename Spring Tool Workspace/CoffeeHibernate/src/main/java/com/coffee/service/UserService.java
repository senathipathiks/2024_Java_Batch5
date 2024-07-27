package com.coffee.service;

import java.util.List;

import com.coffee.model.User;


public interface UserService {
	public void addUser(User user);
	public void delUser(int id);
	public List<User> viewAllUser();
	public void updateUser(User user);
	public User findUser(int id);
}
