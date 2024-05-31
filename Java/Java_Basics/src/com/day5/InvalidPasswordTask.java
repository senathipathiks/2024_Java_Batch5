package com.day5;

import java.util.Scanner;

class InvalidPasswordException extends Throwable{
	InvalidPasswordException(String msg){
		super(msg);
	}
}

class PassCheck{
	PassCheck(String password) throws InvalidPasswordException{
		if(password.length() >= 8 && password.length() <= 16) {
				if((password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-") || password.contains("+") || password.contains("/") || password.contains(":") || password.contains(".") || password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?") || password.contains("|"))) 
				{ 
					System.out.println("Valid Password!!!"); 
				} 
				else {
					throw new InvalidPasswordException("Password should contain special characters!!!");
				}
		}
		else {
			throw new InvalidPasswordException("Password length should be within 8 to 16!!!");
		}
	}
}

public class InvalidPasswordTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Password String: ");
			PassCheck pc = new PassCheck(sc.next());
		}
		catch(InvalidPasswordException e) {
			System.out.println("Error: "+e);
		}
	}

}
