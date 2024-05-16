package com.day6;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		try {
			for(int i = 0; i <= 4; i++) {
				arr[i] = sc.nextInt();	
			}
		}
		catch(NumberFormatException e) { //we have multiple catch in single try block. the order is specific to general.
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception Handled successfully");
		}

	}

}
