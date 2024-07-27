package com.day5;

import java.io.*;
import java.util.Scanner;

class InvalidMonthException extends Exception{
	InvalidMonthException(String msg){
		super(msg);
	}
}

class MonthCheck{
	MonthCheck(int month) throws InvalidMonthException{
		if(month < 0 || month > 12) {
			throw new InvalidMonthException("Invalid Month Range");
		}
		
		else {
			if(month == 1) {
				System.out.println("January Month");
			}
			else if(month ==2) {
				System.out.println("February Month");
			}
			else if(month ==3) {
				System.out.println("March Month");
			}
			else if(month ==4) {
				System.out.println("April Month");
			}
			else if(month ==5) {
				System.out.println("May Month");
			}
			else if(month ==6) {
				System.out.println("June Month");
			}
			else if(month ==7) {
				System.out.println("July Month");
			}
			else if(month ==8) {
				System.out.println("August Month");
			}
			else if(month ==9) {
				System.out.println("September Month");
			}
			else if(month ==10) {
				System.out.println("October Month");
			}
			else if(month ==11) {
				System.out.println("November Month");
			}
			else if(month == 12) {
				System.out.println("December Month");
			}
		}
	}
}

public class InvalidMonthTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Month:");
			MonthCheck mc = new MonthCheck(sc.nextInt());
		}
		catch(InvalidMonthException e) {
			System.out.println("Error: "+e);
		}

	}

}
