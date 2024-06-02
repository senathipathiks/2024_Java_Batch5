package com.day1;
import java.util.Scanner;

public class reverseAnArrayOfIntegerValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array size:");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = x-1 ; i >= 0 ; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
