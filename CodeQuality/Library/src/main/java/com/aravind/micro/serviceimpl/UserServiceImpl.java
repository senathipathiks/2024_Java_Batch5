package com.aravind.micro.serviceimpl;

import org.springframework.stereotype.Service;
import com.aravind.micro.model.User;
import com.aravind.micro.repository.UserRepo;
import com.aravind.micro.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepository;

	public UserServiceImpl(UserRepo userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User login(String username, String password) {
		return userRepository.login(username, password);
	}

}
