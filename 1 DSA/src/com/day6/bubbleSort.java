package com.day6;

import java.util.Scanner;

public class bubbleSort {
	
	public static int bubbleSort(int arr[]){
		int  temp =0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 1; j< (arr.length-i); j++) {
				
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements in array");
		int num = sc.nextInt();
		
		System.out.println("Enter the Elements :");
		int arr[] = new int[num];
		for(int i = 0; i<num; i++) {
			arr [i] = sc.nextInt();
		}
		bubbleSort(arr);
		
		for(int i = 0; i<num; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
}
 