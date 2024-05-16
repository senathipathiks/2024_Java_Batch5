package com.day6;

class Email extends Exception {
	Email(String msg) {
		super(msg);
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

public class EmailFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EmailCommision E = new EmailCommision("meevicky@02");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
