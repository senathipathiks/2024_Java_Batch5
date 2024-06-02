package com.day2ex;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of inputs:");
		int s = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[s];
		
		for(int i=0;i<s;i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<s;i++) {
			if(isPrime(arr[i])) {
				count++;
			}
		}
		System.out.print(count);
	}
		
	static boolean isPrime(int x) {
			
		if(x==1 || x==0) {
			return false;
		}
		
		for(int i=2; i<x; i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;

	}

}
