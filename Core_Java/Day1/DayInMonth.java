package com.day1;
import java.util.Scanner;
public class DayInMonth {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = s.nextInt();
		System.out.println("Enter the month");
		String month = s.next();
		boolean leap =false;
		if(((year % 4 ==0) && (year % 100 != 0)) || year % 400 == 0) {
			leap = true;
		}
		switch(month) {
		case "jan":
			System.out.println("31 days");
			break;
		case "feb":
			if(leap) {
				System.out.println("29 days");
			}
			else {
				System.out.println("28 days");
			}
			break;
		case "mar":
			System.out.println("31 days");
			break;
		case "apr":
			System.out.println("30 days");
			break;
		case "may":
			System.out.println("31 days");
			break;
		case "june":
			System.out.println("30 days");
			break;
		case "july":
			System.out.println("31 days");
			break;
		case "aug":
			System.out.println("31 days");
			break;
		case "sep":
			System.out.println("30 days");
			break;
		case "oct":
			System.out.println("31 days");
			break;
		case "nov":
			System.out.println("30 days");
			break;
		case "dec":
			System.out.println("31 days");
			break;			
			
		}

	}

	
	}


