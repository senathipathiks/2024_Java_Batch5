package com.day1;

import java.util.Scanner;

public class AddBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bin1,bin2;
		
		System.out.println("***Adding Two Binary Numbers***");
		System.out.println("Enter 1st Binary number:");
		bin1 = sc.next();
		System.out.println("Enter 2nd Binary number:");
		bin2 = sc.next();
		
		int n0 = Integer.parseInt(bin1);
		int n1 = Integer.parseInt(bin2);
		
		int sum = n0+n1;
		System.out.println("Addition is:"+sum);
	}

}
