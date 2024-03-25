package com.day1;

import java.util.Scanner;

public class FactorialArray {
	
	int fact(int n) {
		int facto = 1;
		for(int i = 1; i <= n; i++) {
			facto = i * facto;			
		}
		return facto;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialArray fc = new FactorialArray();
		Scanner sc = new Scanner(System.in);
		int element = 4;
		int[] arr = new int[element];
		
		
		
		System.out.println("Enter "+ element + " Elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Printing Factorial : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " Factorial is : " + fc.fact(arr[i]));
		}

	}

}
