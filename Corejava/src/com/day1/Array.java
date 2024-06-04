package com.day1;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	int[] arr1 = new int[5];
	
	for(int i = 0; i < 5;i++) {
		arr[i] = sc.nextInt();
	}
	arr1 = arr;
	if(arr1==arr)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	for(int i : arr1) {//for each loop
		System.out.println(i);
	}
	}

}
