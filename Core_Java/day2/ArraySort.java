package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i:arr) {
		System.out.print(i+" ");
		}

	}

}
