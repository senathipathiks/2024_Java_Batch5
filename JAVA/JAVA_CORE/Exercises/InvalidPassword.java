package Exercises;

import java.util.Scanner;

class InvalidPasswordException extends Exception {
	InvalidPasswordException(String msg) {
		super(msg);
	}
}

class PasswordCommision {
	PasswordCommision(String input) throws InvalidPasswordException {
		boolean isValidFormat = input.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$");
		if (!isValidFormat) {
			throw new InvalidPasswordException("Invalid password ");
		} else
			System.out.println("Welcome");
	}

}

public class InvalidPassword {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			PasswordCommision obj1 = new PasswordCommision("02fT%$#K");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Exception handled successfully");
		}

	}

}
