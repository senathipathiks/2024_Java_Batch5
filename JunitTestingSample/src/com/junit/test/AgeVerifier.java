package com.junit.test;


class InvalidAgeException extends Exception
{
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
public class AgeVerifier {

	public String checkEligibility(int age) throws InvalidAgeException{
		
		if(age<18) {
			throw new InvalidAgeException("Not Eligible");
		}
		
		else {
			return("Eligible");
		}
	}
	
	
	
}
