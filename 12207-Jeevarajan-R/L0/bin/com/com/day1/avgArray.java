package com.day1;

import java.util.*;
public class avgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int element = 4;double sum = 0, avg = 0;
		int[] arr = new int[element];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		avg = sum/element;
		System.out.println(avg);

	}

}
