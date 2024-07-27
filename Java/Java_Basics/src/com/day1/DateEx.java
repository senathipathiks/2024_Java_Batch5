package com.day1;

import java.util.Scanner;

public class DateEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Day number from 1 to 7:");
		int n = sc.nextInt();
		
		if(n==1) {
			System.out.println("Sunday");
		}
		else if(n==2) {
			System.out.println("Monday");
		}
		else if(n==3) {
			System.out.println("Tuesday");
		}
		else if(n==4) {
			System.out.println("Wednesday");
		}
		else if(n==5) {
			System.out.println("Thursday");
		}
		else if(n==6) {
			System.out.println("Friday");
		}
		else if(n==7) {
			System.out.println("Saturday");
		}
		
	}

}
