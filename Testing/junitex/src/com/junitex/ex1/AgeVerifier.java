package com.junitex.ex1;


class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg){
		super(msg);
	}
}

public class AgeVerifier {

	public String checkEligibility(int age) throws InvalidAgeException
	{
		if(age<18) {
			throw new InvalidAgeException("Not Eligiblle");
		}
		else {
			return("Eligible");
		}
	}
	
}
