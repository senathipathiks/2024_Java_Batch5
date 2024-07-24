package com.nandha.Myapp.bean;

import org.springframework.stereotype.Component;

@Component
public class Login {
	
	
	String name;
	
	 String password;
	

	public Login() {
		// TODO Auto-generated constructor stub
	}


	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Login [name=" + name + ", password=" + password + "]";
	}
	
	

}
