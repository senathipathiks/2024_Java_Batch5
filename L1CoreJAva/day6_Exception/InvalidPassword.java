package com.day6_Exception;

class Valid1 extends Exception{
	Valid1(String n){
		super(n);
	}
}
class PasswordCommision {
	PasswordCommision(String input) throws Valid1 {
		boolean isValidFormat = input.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$");
		if (!isValidFormat) {
			throw new Valid1("Invalid password ");
		} else
			System.out.println("Valid Password");
	}
 
}
public class InvalidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PasswordCommision v = new PasswordCommision("MeeVicky@0202020");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
