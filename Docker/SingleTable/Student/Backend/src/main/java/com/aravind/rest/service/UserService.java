package com.aravind.rest.service;

import com.aravind.rest.model.User;

public interface UserService {

	public String addUser(User user);

	public String login(User user);

}
