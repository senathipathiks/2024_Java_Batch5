package com.day1;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = n-i; j > 1; j--) {
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
