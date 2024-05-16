package com.day2_Array;
import java.util.Arrays;
import java.util.Scanner;
public class Array_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
