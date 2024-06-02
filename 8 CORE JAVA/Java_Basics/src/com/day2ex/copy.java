package com.day2ex;

import java.util.Scanner;

public class copy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of inputs:");
		int x = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[x];
		int arr1 [] = new int [x];
		for(int i=0;i<x;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=0;j<x;j++) {
			arr1[j] = arr[j];
		}
		
		System.out.println("Second array:");
		for(int i=0;i<x;i++) {
			System.out.print(arr1[i]+ " ");
		}

	}

}
