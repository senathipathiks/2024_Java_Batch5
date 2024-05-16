package com.day6;

class InvalidAgeException extends Exception { //here we can extends by throwable class if we give here we change the catch block like (Throwable e)
	InvalidAgeException(String msg) {
		super(msg);
	}
}

class ElectionCommision {
	ElectionCommision(int age) throws InvalidAgeException {
		if (age < 18 || age > 110) {
			throw new InvalidAgeException("Not a valid age");
		} else {
			System.out.println("Welcome to Election Commision of India");
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		try {
			ElectionCommision e = new ElectionCommision(13);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Exception handled successfully");
		}

	}

}
