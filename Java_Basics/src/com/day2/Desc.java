package com.day2;

import java.util.Scanner;

public class Desc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Range");
		int range = sc.nextInt();
		
		int arr[] = new int[range];

		
		int num,temp=0;

		System.out.println("Enter the numbers:");
		for(int i=0;i<range;i++){
			arr[i] = sc.nextInt();	
		}

		System.out.println("The numbers in descending order:");
		for(int i = 0 ; i<range-1 ; i++) {
			for(int j=i;j<range;j++) {
				if( arr[j] < arr[i]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				}
			}
	}
		for(int i=range-1; i>=0;i--) {
			System.out.println(arr[i]);
		}

}
}
