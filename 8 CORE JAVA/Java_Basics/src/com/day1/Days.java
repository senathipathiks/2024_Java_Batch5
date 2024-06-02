package com.day1;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the month: ");
		String month = sc.next();
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		
		switch (month.toLowerCase()) {
		case "january":
			System.out.println("January month Days: 31");
			break;
		case "february":
			
			boolean isLeapYear = false;

	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    isLeapYear = true;
	                }
	            } else {
	                isLeapYear = true;
	            }
	        }

	        // Output the result
	        if (isLeapYear) {
	            System.out.println("This is a leap year, February month Days: 29");
	        } else {
	            System.out.println("February month Days: 28");
	        }
			
			break;
		case "march":
			System.out.println("March month Days: 31");
			break;
		case "april":
			System.out.println("April month Days: 30");
			break;
		case "may":
			System.out.println("May month Days: 31");
			break;
		case "june":
			System.out.println("June month Days: 30");
			break;
		case "july":
			System.out.println("July month Days: 31");
			break;
		case "august":
			System.out.println("August month Days: 31");
			break;
		case "september":
			System.out.println("September month Days: 30");
			break;
		case "october":
			System.out.println("October month Days: 31");
			break;
		case "november":
			System.out.println("November month Days: 30");
			break;
		case "december":
			System.out.println("December month Days: 31");
			break;
		default:
			System.out.println("Enter the valid input");
			break;
		}
		

	}

}
