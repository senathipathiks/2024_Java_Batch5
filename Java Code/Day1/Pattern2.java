package com.day2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Value:");
		n = sc.nextInt();
		int k = n;
		
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<k;j++)
             {
                  System.out.print("* ");
             }
             k--;
             System.out.println("");
         }
	}
}
