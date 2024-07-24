package com.supraja.atComponent;

public class Email 
{
  private String email;

public Email(String email) {
	super();
	this.email = email;
}

public Email() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Email [email=" + email + "]";
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
  
}
