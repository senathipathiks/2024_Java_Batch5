package com.day1;
import java.util.Scanner;

public class maximumAndMinimumValueOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array size:");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		for(int i = 0 ; i < x ;i++) {
			arr[i]=sc.nextInt();
		}

		int min=arr[1];
		int max=arr[1];
		for(int i = 0 ; i < x ;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Min Value is :" + min);
		System.out.println("Max Value is :" + max);
	}


}
