package com.day2;
import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		String fname,lname,aadhar,pan,dob;
		
		System.out.println("\t\t***PIN Generation***");
		System.out.println("Enter First Name:");
		fname = sc.nextLine();
		System.out.println("Enter Last Name:");
		lname = sc.nextLine();
		System.out.println("Enter Aadhar number:");
		aadhar = sc.nextLine();
		System.out.println("Enter PAN number:");
		pan = sc.nextLine();
		System.out.println("Enter Date Of Birth (Format should be DD-MM-YYYY): ");
		dob = sc.nextLine();
		
		System.out.println("Your PIN is: ");
		
		System.out.println( (fname.substring(0, 3).toLowerCase()) + (lname.substring(lname.length()-2).toUpperCase()) + (aadhar.substring(5, 9)) + (pan.substring(4,8)) +(dob.substring(3,6)) );
	}

}
