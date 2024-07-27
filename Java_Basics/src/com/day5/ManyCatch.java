package com.day5;

import java.util.Scanner;

public class ManyCatch {

	public static void main(String[] args) throws ClassNotFoundException {
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		try {
			for(int i=0 ; i<arr.length ; i++) {
				arr[i] = sc.nextInt();
			}
		}
		
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
