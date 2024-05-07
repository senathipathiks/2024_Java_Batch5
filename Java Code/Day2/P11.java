package com.day2;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of inputs:");
		int n = sc.nextInt();
		
		System.out.println("Enter the values");
		int arr [] = new int[n];
		
		for(int i=0;i<n;i++) 
		{
			int c=0;
			arr[i] = sc.nextInt();
			for(int j=2;j<=arr[i]/2;j++)
			{
				if(arr[i]%j==0)
				{
					c=1; 
					break;
				}
			}
			if(c==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
