package Exercises;

import java.util.Scanner;

class InvalidMonthException extends Exception {
	InvalidMonthException(String msg) {
		super(msg);
	}
}

class ElectionCommision {
	ElectionCommision(int month) throws InvalidMonthException {
		if (month < 1 || month > 12) {
			throw new InvalidMonthException("Invalid Month");
		} else
			System.out.println("Welcome");
	}

}

public class InvalidMonth {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ElectionCommision obj1 = new ElectionCommision(12);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Exception handled successfully");
		}

	}

}
