package com.day6;

class InvalidPassword extends Exception{
	InvalidPassword(String str){
		super(str);
	}
}

class Password{
	Password(String data) throws InvalidPassword{
		boolean pass = data.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$");
		if(!pass) {
			throw new InvalidPassword("Invalid Password");
		}
		else {
			System.out.println("Valid Password");
		}

	}
}
public class Password_Test {

	public static void main(String[] args) {
		try {
			Password p = new Password("P@ssw0rd");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handled successfully");
		}
		

	}

}
