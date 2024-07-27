package com.day1;

import java.util.Scanner;

public class Asterisk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stars needed:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			{
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}