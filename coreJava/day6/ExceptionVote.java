package com.day6;

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg) {
		super(msg);
	}
}

class ElectionCommision{

	ElectionCommision(int age)throws InvalidAgeException
	{
	if(age<18||age>110) {
		throw new InvalidAgeException("invalid age");
	}
	else {
		System.out.println("welcome to election commission");
	}
}
}
public class ExceptionVote {

	public static void main(String[] args) {

		try {
			
			ElectionCommision obj=new ElectionCommision(15);
			
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		
		finally {
			System.out.println("exception handled succesfully");
		}
	}

}
