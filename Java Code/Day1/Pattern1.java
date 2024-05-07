package com.day2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Value:");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
            for(int j=0;j<=i;j++)
            {
    	         System.out.print("* ");
	        }
		   System.out.println("");
		}

	}

}
