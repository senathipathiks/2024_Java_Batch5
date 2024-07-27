package com.springboot.eg11.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.eg11.model.signin;
import com.springboot.eg11.repo.signinrepo;

@Service
public class signinserviceimplementation implements signinservice
{
	
	public signinserviceimplementation(signinrepo repo) {
		super();
		this.repo = repo;
	}
	signinrepo repo;

	@Override
	public String addUser(signin signin) {
		repo.save(signin);
		return "AddSuccess";
	}

	@Override
	public List<signin> getAllUsers() {

		return repo.getAllUsers();
	}

}
