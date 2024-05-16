package com.day2;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum +=arr[i];
		}
		double avg = sum/n;
		
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+avg);

	}

}
