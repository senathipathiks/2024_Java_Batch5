package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N value :");
		int n = sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(i%2!=0) {
				System.out.print(a[i]+" ");
			}
		}

	}
}
