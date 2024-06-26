package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Login {
	
	private String uname;
	private String psw;

	@Override
	public String toString() {
		return "Login [uname=" + uname + ", psw=" + psw + "]";
	}

	public Login(String uname, String psw) {
		super();
		this.uname = uname;
		this.psw = psw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
