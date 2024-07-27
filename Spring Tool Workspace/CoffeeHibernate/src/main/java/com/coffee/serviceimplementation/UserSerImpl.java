package com.coffee.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coffee.model.User;
import com.coffee.repo.UserRepo;
import com.coffee.service.UserService;

@Service
public class UserSerImpl implements UserService{
	
	UserRepo repo;

	public UserSerImpl(UserRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addUser(User user) {
		repo.save(user);
	}

	@Override
	public User findUser(int id) {
		return repo.findUserById(id);
	}

	@Override
	public void delUser(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<User> viewAllUser() {
		return repo.getAllUsers();
	}

	@Override
	public void updateUser(User user) {
		repo.updateUser(user);
	}
	
}
