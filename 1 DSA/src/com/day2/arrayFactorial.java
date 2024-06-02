package com.day2;

import java.util.Scanner;

public class arrayFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int arrSize = sc.nextInt();
		
		int arr[] = new int[arrSize];
		
		System.out.println("Enter " + arrSize + " Elements ");
		for(int i=0; i<arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<arrSize; i++) {
			int fact =1;
			for(int j=1; j<=arr[i]; j++) {
				fact=fact*j;
			}
			System.out.println(arr[i] + " Factorial is : " +fact);
		}
			

	}

}
