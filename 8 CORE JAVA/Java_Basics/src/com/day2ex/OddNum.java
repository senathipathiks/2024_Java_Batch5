package com.day2ex;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of inputs:");
		int s = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[s];
		
		for(int i=0;i<s;i++) {
			arr[i] = sc.nextInt();
		}
		int count =0;
		for(int i=0;i<s;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
