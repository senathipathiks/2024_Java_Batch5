package com.day1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int element = 4;
		int[] arr = new int[element];
		
		System.out.println("Enter "+ element + " Elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Min is "+ arr[0] + ", Max is "+ arr[element-1]);
	sc.close();
	}
	

}
