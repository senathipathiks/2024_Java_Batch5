package com.day2;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements:");
		for(int i = 0; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Duplicate elements are");
		for(int i = 0; i < n ; i++) {
			for(int j = i + 1 ; j < n ; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
