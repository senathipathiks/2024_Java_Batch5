package com.aravind.rest.serviceimpl;

import org.springframework.stereotype.Service;

import com.aravind.rest.model.User;
import com.aravind.rest.repository.UserRepo;
import com.aravind.rest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepository;

	public UserServiceImpl(UserRepo userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public String addUser(User user) {
		 userRepository.save(user);
		 return "Success";
	}

	@Override
	public String login(User loginuser) {
		User user = userRepository.findByUsername(loginuser.getUsername());
		 if(user!=null) {
			 if((user.getPassword()).equals(loginuser.getPassword())) {
				 return "Success";
			 }
			 else {
				 return "Fail1";
			 }
		 }else {
			 return "Fail2";
		 }
	}

}
