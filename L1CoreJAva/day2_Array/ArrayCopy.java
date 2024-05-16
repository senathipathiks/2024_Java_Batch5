package com.day2_Array;
import java.util.*;
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		int arr1[] = new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
		}
//		System.arraycopy(arr, 0, arr1, 2, 2);
//		arr1=arr.clone();
//		for(int i:arr1) {
//			System.out.print(i+" ");
//		}
//		arr1=arr;                                               // references are same
//		if(arr1==arr) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
		arr1=arr.clone();                                       //references are different
//		if(arr1==arr) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
	}

}
