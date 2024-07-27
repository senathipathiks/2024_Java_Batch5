package com.coffee.service;

import java.util.List;
import java.util.Optional;

import com.coffee.model.User;


public interface UserService {
	public void addUser(User user);
	public Optional<User> getUser(int id);
	public void delUser(int id);
	public List<User> viewAllUser();
	public void updUser(User user);
}
