package com.day1;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		int n = s.nextInt();
			    
		int k = 0;

			    for (int i = 1; i <= n; ++i, k = 0) {
			      for (int space = 1; space <= n - i; ++space) {
			        System.out.print("  ");
			      }

			      while (k != 2 * i - 1) {
			        System.out.print("* ");
			        ++k;
			      }

			      System.out.println();
			    }
	}
}
