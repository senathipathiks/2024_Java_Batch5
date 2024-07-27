package com.springboot.eg11.repo;

import java.util.List;

import com.springboot.eg11.model.signin;

public interface signinrepo 
{
	public void save (signin signin);
	
	public List<signin> getAllUsers();
}
