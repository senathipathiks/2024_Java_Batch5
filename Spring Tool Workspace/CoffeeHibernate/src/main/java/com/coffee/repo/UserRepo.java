package com.coffee.repo;

import java.util.List;

import com.coffee.model.User;

public interface UserRepo{
	
	public void deleteById(int id);
	
	public List<User> getAllUsers();
	
	public User findUserById(int id);
	
	public void updateUser(User user);

	public void save(User user);
}
