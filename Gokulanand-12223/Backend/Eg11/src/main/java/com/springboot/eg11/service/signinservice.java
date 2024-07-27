package com.springboot.eg11.service;

import java.util.List;

import com.springboot.eg11.model.signin;

public interface signinservice 
{
	public String addUser(signin signin);
	
	public List<signin> getAllUsers();
}
