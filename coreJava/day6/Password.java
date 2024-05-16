package com.day6;


 
class Invalid extends Exception {
	Invalid(String msg) {
		super(msg);
	}
}
 
class PasswordCommision {
	PasswordCommision(String input) throws Invalid{
		boolean isValidFormat = input.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$");
		if (!isValidFormat) {
			throw new Invalid("Invalid password ");
		} else
			System.out.println("Welcome");
	}
 
}
 
public class Password {
 
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			PasswordCommision p = new PasswordCommision("02fT%$#K");
		} catch (Exception e) {
			System.out.println(e);
		}
 
	}
 
}
 