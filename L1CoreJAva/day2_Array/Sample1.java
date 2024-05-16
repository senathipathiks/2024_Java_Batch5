package com.day2_Array;

import java.util.*;

public class Sample1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		int arr[] = new int[] {1,2,3,4,5};
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
//		}
//		System.out.print(arr.length);
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
