package com.subash.atComponent;

public class Email {

	private String email;
	
	public Email() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Email(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}
	

}
