package com.day1;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int a)
	{
		int fact = 1;
		for(int i =1; i <= a; i++) {
			fact =fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array Elements :");
		for(int i =0;i < arr.length; i++) {
			arr[i] = sc.nextInt();
			int y = fact(arr[i]);
			System.out.println("The Factorial of the Array Elements :" + y);
		}
		

	}

}
