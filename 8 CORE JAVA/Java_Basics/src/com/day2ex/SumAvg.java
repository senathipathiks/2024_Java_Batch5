package com.day2ex;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[10];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum value is : "+sum);
		System.out.println("The Avg of the array is: "+sum/arr.length);	
	}
}
