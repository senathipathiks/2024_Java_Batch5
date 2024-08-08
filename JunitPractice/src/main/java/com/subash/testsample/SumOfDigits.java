package com.subash.testsample;

public class SumOfDigits {

	public static int sumOfDigits(int arr[]) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
