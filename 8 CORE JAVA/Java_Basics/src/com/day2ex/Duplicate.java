package com.day2ex;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of inputs:");
		int s = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[s];
		
		for(int i=0;i<s;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<s;i++) {
			for(int j=i+1;j<s;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}