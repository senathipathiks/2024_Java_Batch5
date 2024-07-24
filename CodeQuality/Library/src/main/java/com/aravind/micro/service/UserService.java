package com.aravind.micro.service;




import com.aravind.micro.model.User;


public interface UserService  {
	public void addUser(User user);
	public User login(String username, String password);
	
}
