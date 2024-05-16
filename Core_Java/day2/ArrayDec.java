package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5] ;
		int arr1[] = new int[5];
 //		System.out.println(arr[0]);
//		System.out.println(arr.length);
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
//		System.arraycopy(arr, 0, arr1, 0, 2); 
//		System.arraycopy(arr, 0, arr1, 0, 2);
//		System.arraycopy(arr, 0, arr1, 2, 2);
//		arr1 = arr;  //-> references are same
//		if(arr1 == arr) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
		arr1 = arr.clone();
		if(arr1 == arr) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		for(int i : arr1) {
			System.out.println(i);
		}
		
		

	}

}
