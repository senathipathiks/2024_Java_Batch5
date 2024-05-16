package com.day6;

class InvalidEmail extends Exception{
	InvalidEmail(String str){
		super(str);
	}
}

class Email{
	Email(String email) throws InvalidEmail{
		boolean res = email.matches("^[a-zA-Z0-9.! #$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
		if(!res) {
			throw new InvalidEmail("Invalid Email");
		}
		else {
			System.out.println("valid Email");
		}
	}
}

public class Email_Test {

	public static void main(String[] args) {
		try {
			Email e1 = new Email("john.doecompany");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handled successfully");
		}
	}

}
