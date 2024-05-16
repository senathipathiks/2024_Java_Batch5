package com.day1;
import java.util.*;
public class NoofDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the month name in number: ");
		int month = s.nextInt();
		if(month==1 || month==3 || month==5 || month==7 || month==9 || month==12) {
			System.out.println("No of days is 31");
		}
		else if(month==2) {
			System.out.println("No of days is 28");
		}
		else {
			System.out.println("No of days is 30");
		}

	}

}
