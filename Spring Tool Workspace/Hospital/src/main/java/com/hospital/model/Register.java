package com.hospital.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@CrossOrigin("*")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uname;
	private String fname;
	private String lname;
	private String password;
	private String email;
	
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Register(int id, String uname, String fname, String lname, String password, String email) {
		super();
		this.id = id;
		this.uname = uname;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", uname=" + uname + ", fname=" + fname + ", lname=" + lname + ", password="
				+ password + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
