package com.gopi.restapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopi.restapp.model.User;
import com.gopi.restapp.repository.UserRepository;
import com.gopi.restapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {


	@Autowired
	UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User saveUser(User user) {
        user.setPassword((user.getPassword()));
        return userRepository.save(user);
    }
}
