package com.day2;

import java.util.Scanner;

public class EvenVal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements:");
		for(int i = 0; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Even Position elements are");
		for(int i = 0; i < n ; i+=2) {
			System.out.print(arr[i]+" ");
		}
	}

}
