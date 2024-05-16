package com.day2;

import java.util.Scanner;

public class Unique {

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
		
		boolean flag = false;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					flag = true;
				}
			}
		}
		if(flag == false) {
			System.out.println("All elements are unique");
		}
		else {
			System.out.println("Duplicates elements presented");
		}
	}
}
