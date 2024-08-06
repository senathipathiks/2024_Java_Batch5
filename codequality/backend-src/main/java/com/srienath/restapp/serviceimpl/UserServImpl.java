package com.srienath.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.srienath.restapp.model.User;
import com.srienath.restapp.repository.UserRepo;
import com.srienath.restapp.service.UserServ;

@Service
public class UserServImpl implements UserServ{

	UserRepo repo;
		
	public UserServImpl(UserRepo repo) {
		this.repo = repo;
	}

	@Override
	public String addUser(User us) {
		repo.save(us);
		return "Insertion Success";
	}

	@Override
	public List<User> listAllUsers() {
		return repo.findAll();
	}

	@Override
	public User getUserById(int id) {
		Optional<User> user = repo.findById(id);
		if(user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}

	@Override
	public String updateUser(User us) {
		repo.save(us);
		return "Updation Success";
	}

	@Override
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "Deletion Success";
	}
}

