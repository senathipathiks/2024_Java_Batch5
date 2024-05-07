package com.day1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Prime: ");
		int s,c=0,e;
		s=sc.nextInt();
		System.out.println("Enter the End Prime: ");
		e=sc.nextInt();
		for(int i=s;i<=e;i++) 
		{
			c=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0) {
					c=1;
					break;
				}
			}
			if(c==0) {
				System.out.print(i+" ");
			}
		}
	}
}
