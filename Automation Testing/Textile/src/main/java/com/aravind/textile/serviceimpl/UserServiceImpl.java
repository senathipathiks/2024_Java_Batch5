package com.aravind.textile.serviceimpl;

import org.springframework.stereotype.Service;

import com.aravind.textile.model.User;
import com.aravind.textile.repository.UserRepo;
import com.aravind.textile.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepository;

	public UserServiceImpl(UserRepo userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public String addUser(User user) {
		return userRepository.save(user);

	}

	@Override
	public User login(String username, String password) {
		return userRepository.login(username, password);

	}

}
