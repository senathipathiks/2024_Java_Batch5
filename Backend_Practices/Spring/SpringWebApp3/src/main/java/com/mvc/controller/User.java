package com.mvc.controller;


public class User {
	
	String uname;
	String pwd;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserDetails: [UserName=" + uname + ", Password=" + pwd + "]";
	}
	

}
