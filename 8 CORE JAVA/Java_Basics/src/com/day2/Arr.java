package com.day2;

import java.util.Arrays;

public class Arr {

	public static void main(string[] args) {
		System.out.println();
		int arr [] = new int [] {1,6,9,2,5};
		int arr1[] = new int [5];
		int arr2[] = new int [5];
		
		arr1=arr;
		for(int i:arr1) {
			System.out.println(i);
		}
		System.out.println();
		if(arr1==arr) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.println();
		arr1=arr.clone();
		if(arr2==arr) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println();
	}
}
