package com.aravind.Task1;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String user;
	
	private String pass;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
