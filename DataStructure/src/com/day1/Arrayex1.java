package com.day1;

import java.util.Scanner;

public class Arrayex1 {

	public static void main(String[] args) {
		//Array object creation
		int arr[] = new int[5];
		int sum = 0, even = 0, odd = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Initialize the array elements
		System.out.println("Enter 5 Elements :");
		for(int i =0;i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Traversing the Array
		
		System.out.println("Array Elements :");
		for(int i =0;i < arr.length; i++) {
			System.out.println(arr[i]);
			
			//Even odd
			if( arr[i] % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			
			//Sum
			sum += arr[i];

		}
		System.out.println("Sum of the Array :" + sum);
		System.out.println("Even Number :" + even);
		System.out.println("Odd Number :" + odd);
		
	}

}
