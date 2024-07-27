package com.springboot.eg11.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "signin")
public class signin 
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "Id")
	private int sign_id;
	@Column( name = "Signin_Name")
	private String sign_name;
	@Column( name = "Signin_Email")
	private String sign_email;
	@Column( name = "Signin_Password")
	private String sign_password;
	
	public signin() 
	{
		super();
	}

	public signin(int sign_id, String sign_name, String sign_email, String sign_password) {
		super();
		this.sign_id = sign_id;
		this.sign_name = sign_name;
		this.sign_email = sign_email;
		this.sign_password = sign_password;
	}

	public int getSign_id() {
		return sign_id;
	}

	public void setSign_id(int sign_id) {
		this.sign_id = sign_id;
	}

	public String getSign_name() {
		return sign_name;
	}

	public void setSign_name(String sign_name) {
		this.sign_name = sign_name;
	}

	public String getSign_email() {
		return sign_email;
	}

	public void setSign_email(String sign_email) {
		this.sign_email = sign_email;
	}

	public String getSign_password() {
		return sign_password;
	}

	public void setSign_password(String sign_password) {
		this.sign_password = sign_password;
	}

	@Override
	public String toString() {
		return "signin [sign_id=" + sign_id + ", sign_name=" + sign_name + ", sign_email=" + sign_email
				+ ", sign_password=" + sign_password + "]";
	}
}
