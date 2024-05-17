package com.day2;
import java.util.Scanner;
public class Day2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
//		System.out.println(arr[0]);
//		System.out.println(arr.length);
		for(int i =0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
