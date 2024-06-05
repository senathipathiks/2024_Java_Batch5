package com.subash.atComponentSimple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Email {
	@Value("SUBASH@gmail.com")
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
