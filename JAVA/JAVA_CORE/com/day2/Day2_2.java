package com.day2;
import java.util.Scanner;
public class Day2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int[] arr1 = new int[5];
//		System.out.println(arr[0]);
//		System.out.println(arr.length);
		for(int i =0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
//		System.arraycopy(arr, 0,arr1,0, 5);
		arr1=arr;
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
