package Exercises;

import java.util.Scanner;

class InvalidEmailException extends Exception {
	InvalidEmailException(String msg) {
		super(msg);
	}
}

class EmailCommision {
	EmailCommision(String input) throws InvalidEmailException {
		boolean isValidFormat = input.matches("^(.+)@(.+)$");
		if (!isValidFormat) {
			throw new InvalidEmailException("Invalid email format ");
		} else
			System.out.println("Welcome");
	}

}

public class InvalidEmail {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			EmailCommision obj1 = new EmailCommision("ani@gmail.com");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Exception handled successfully");
		}

	}

}
