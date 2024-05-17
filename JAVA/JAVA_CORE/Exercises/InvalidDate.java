package Exercises;

import java.util.Scanner;

class InvalidFormatException extends Exception {
	InvalidFormatException(String msg) {
		super(msg);
	}
}

class DateCommision {
	DateCommision(String date) throws InvalidFormatException {
		boolean isValidFormat = date.matches("([1-9]{1}|[0]{1}[1-9]{1}|[1]{1}[0-9]{1}|[2]{1}[0-9]{1}|[3]{1}[0-1]{1})" +
		           "([/]{1})" +
		           "([0]{1}[1-9]{1}|[1]{1}[0-2]{1}|[1-9]{1})" +
		           "([/]{1})" +
		           "([20]{2}[0-9]{2})");
		if (!isValidFormat) {
			throw new InvalidFormatException("Invalid date ");
		} else
			System.out.println("Welcome");
	}

}

public class InvalidDate {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			DateCommision obj1 = new DateCommision("02/01/2024");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Exception handled successfully");
		}

	}

}
