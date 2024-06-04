package com.day1;
import java.util.*;
public class factorial {

	static int factorial(int a) {
		
	
	int factorial = 1;
	for(int i = 1; i <= a; i++) {
		factorial = factorial *i;
	}
	return factorial;
	}

	
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers : ");
		for(int i = 0;i < arr.length; i++) {
			arr[i] = sc.nextInt();
			int y = factorial(arr[i]);
			System.out.println("Factorial is : " + y);
			
		
		
		
		}
	}
}
