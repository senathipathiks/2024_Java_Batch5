package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N value :");
		int n = sc.nextInt();
		int a[]= new int[n];
		int b[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
