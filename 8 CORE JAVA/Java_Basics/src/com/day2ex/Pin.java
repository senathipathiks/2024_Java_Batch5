package com.day2ex;

import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Fisrt Name: ");
		String f_Name = sc.next();
		System.out.print("Enter your Last Name: ");
		String l_Name = sc.next();
		System.out.print("Enter your Aadhaar Number: ");
		String aadhar = sc.next();
		System.out.print("Enter your PAN Number: ");
		String pan = sc.next();
		System.out.print("Enter your Date of Birth: ");
		String dob = sc.next();
		
		String pin = l_Name.substring(l_Name.length()-3).toUpperCase();
		pin = f_Name.substring(0,3).toLowerCase();
		
		System.out.println(pin);
	}

}
