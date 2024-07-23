package com.day5;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num 1:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num 2:");
		int num2 = sc.nextInt();
		
//		System.out.println(num1%num2);
		
		try {
			System.out.println(num1 / num2);
		}
		
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		finally {
			System.out.println("Exception Handled Successfully!!!");
		}
	}

}
