package com.day6_Exception;

class Email extends Exception{
	Email(String n){
		super(n);
	}
}

class EmailCommision {
	EmailCommision(String input) throws Email{
		boolean isValidFormat = input.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
		if (!isValidFormat) {
			throw new Email("Invalid Email ");
		} else
			System.out.println("Valid Email");
	}
}

public class InvalidEmail {

	public static void main(String[] args) {
		
		try {
			EmailCommision E = new EmailCommision("Meevicky@gmail.com");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
