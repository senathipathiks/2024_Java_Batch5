package com.day2;

import java.util.Scanner;

public class PinGeneration {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Name:");
		String fname = s.next();
		System.out.println("Enter the last Name:");
		String lname = s.next();
	    System.out.println("Enter the Aadhar Number 12 digits xxxx-xxxx-xxxx:");
	    String aadhar = s.next();
	    System.out.println("Enter the Pan number 4 chars followed by 4 numbers and final 1 char:");
	    String pan = s.next();
	    System.out.println("Enter the Dob in the format of dd-mmm-yyyy:");
	    String dob = s.next();
	    String pin = ((lname.substring(lname.length()-2).toUpperCase())+ (fname.substring(0,4).toLowerCase()) + (aadhar.substring(5,9)) + (pan.substring(4,8)) + dob.substring(3,6));
	    System.out.println("Pin = "+pin);
	}

}
