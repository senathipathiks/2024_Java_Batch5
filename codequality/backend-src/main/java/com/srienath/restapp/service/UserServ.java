package com.srienath.restapp.service;

import java.util.List;
import com.srienath.restapp.model.User;

public interface UserServ {

	public String addUser(User us);

	public List<User> listAllUsers();

	public User getUserById(int id);

	public String updateUser(User us);

	public String deleteUser(int id);

}
