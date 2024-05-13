package com.day2;

import java.util.Iterator;
import java.util.Scanner;

public class SimpleArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = in.nextInt();
		}
		
		int sum = 0, avg=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum = "+ sum);
		System.out.println("Average = "+ sum/10);
	}
}
