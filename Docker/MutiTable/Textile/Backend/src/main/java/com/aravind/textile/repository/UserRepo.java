package com.aravind.textile.repository;

import com.aravind.textile.model.User;

public interface UserRepo {

	public String save(User user);

	public User login(String username, String password);

}
