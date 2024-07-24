package com.assessment.App.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.App.model.User;
import com.assessment.App.repository.UserRepository;
import com.assessment.App.service.UserService;



@Service
public class UserServiceImplementation implements UserService {
	
    private final UserRepository repo;

    @Autowired
    public UserServiceImplementation(UserRepository repo) {
        this.repo = repo;
    }

//  
    
    @Override
	public void saveUser(User user) {
		repo.saveU(user);
	}

	@Override
	public User getUserById(int id) {
		
		return repo.findUById(id);
	}

	@Override
	public List<User> getAllUsers() {

		return repo.findAllUsers();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
		repo.updateU(user);

	}
	
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repo.deleteU(id);

	}

	
}



