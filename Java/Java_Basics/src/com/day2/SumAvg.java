package com.day2;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		int arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Range:");
		int range = sc.nextInt();
		System.out.print("Enter the numbers: ");
		int n;
		for(int i = 0 ; i<range; i++) {
			n = sc.nextInt();
			arr[i]=n;
		}
		
		System.out.println("The numbers are:");
		for(int i=0; i<range ; i++) {
			System.out.print(arr[i]);
		}
		
		int sum=0;
		for(int i=0; i<range;i++) {
			sum+=arr[i];
		}
		
		float avg = sum/range;
		System.out.println();
		System.out.println("The addition is:"+sum);
		System.out.println("The Average is:"+avg);
	}

}