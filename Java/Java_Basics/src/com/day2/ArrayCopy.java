package com.day2;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int arr1[] = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			arr[i] = sc.nextInt();
			}
		
//		System.arraycopy(arr, 0, arr1, 0, 2);
		arr1 = arr.clone();
//		arr1 = arr;
		if(arr1 == arr) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
//		for(int i : arr1) {
//			System.out.println(i);
//		}
	}

}
