package com.day2_Practice;

import java.util.*;

public class PinGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String fname = s.next();
		System.out.println("Enter the last name: ");
//		int a = fname.length();
		String lname = s.next();
//		int b = lname.length();
		System.out.println("Enter the Aadhar Number: ");
		String aadhar = s.next();
//		int c = aadhar.length();
		System.out.println("Enter the PAN Number: ");
		String pan = s.next();
//		int d = pan.length();
		System.out.println("Enter the DOB: ");
		String dob = s.next();
//		int e = dob.length();
		System.out.print((lname.substring(lname.length()-2).toUpperCase())+(fname.substring(0, 3).toLowerCase())+(aadhar.substring(5, 9))+(pan.substring(4, 8))+(dob.substring(3,6)));

	}

}
