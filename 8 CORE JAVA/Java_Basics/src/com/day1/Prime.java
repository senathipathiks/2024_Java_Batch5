package com.day1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			System.out.print("Starting number : ");
			int x = sc.nextInt();
			System.out.print("Ending number : ");
			int y = sc.nextInt();
			
			for(int i=x;i<=y;i++) {
				if(isPrime(i)) {
					System.out.print(i + " ");
				}
			}
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
