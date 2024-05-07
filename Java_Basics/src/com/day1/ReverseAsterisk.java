package com.day1;

import java.util.Scanner;

public class ReverseAsterisk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stars needed:");
		int n=sc.nextInt();
		
		int i,j;
		
		for(i=n;i>=1;i--) {
			for(j=0;j<=i-1;j++)
            {
                System.out.print("* ");
            }
			System.out.println();
		}
	}
}
