package com.day2;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = s.nextInt();
		int arr[] = new int[n];
		int arr2[] = new int[arr.length];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("array copy:");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		

	}

}
