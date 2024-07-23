package com.day2;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Range:");
		int n = sc.nextInt();
		
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		System.out.println("Enter the Elements:");
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("The elements in array 1 are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0;i<n;i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("Elements in array 2 are:");
		for( int i = 0; i<n;i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
