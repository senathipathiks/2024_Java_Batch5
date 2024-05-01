package com.day1;

import java.util.Scanner;

public class DayDisplay {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String msg = "false";
		do { 	
		System.out.println("Enter the data:");
		int data = s.nextInt();
		switch(data) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid data");
			break;
			
		}
		System.out.println("Do u want to continue [yes or no]");
		msg = s.next();
		}while(msg.equals("yes"));	

	}

}
