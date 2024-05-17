package com.day2;

import java.util.Scanner;

public class PinRandomly {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name:");
		String fn=sc.next();
		System.out.println("Enter the last name:");
		String ln=sc.next();
		int l=ln.length();
		System.out.println("Enter the AAdhaar number:");
		String aadh=sc.next();
		System.out.println("Enter the PAN number:");
		String pan=sc.next();
		System.out.println("Enter the DOB:");
		String dob=sc.next();
//		System.out.println(str1.substring(4));
		System.out.println(ln.substring(l-2).toUpperCase()+ fn.substring(0,3)+aadh.substring(5,9)+ pan.substring(4,9)+dob.substring(4,7));
	}

}
