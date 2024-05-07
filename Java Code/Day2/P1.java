package com.day2;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0,avg=0;
		
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("The sum of the Array is :"+sum);
		System.out.print("The Average of the Array is :"+sum/a.length);
	
	}
}
