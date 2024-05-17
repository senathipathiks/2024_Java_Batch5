package Exercises;

import java.util.Scanner;

class InvalidFileException extends Exception {
	InvalidFileException(String msg) {
		super(msg);
	}
}

class FileCommision {
	FileCommision(String input) throws InvalidFileException {
		boolean isValidFormat = input.matches("^.*\\.(jpg|JPG|gif|GIF|doc|DOC|pdf|PDF|txt)$");
		if (!isValidFormat) {
			throw new InvalidFileException("Invalid file format ");
		} else
			System.out.println("Welcome");
	}

}

public class InvalidFile {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			FileCommision obj1 = new FileCommision("ani.jpg");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Exception handled successfully");
		}

	}

}
