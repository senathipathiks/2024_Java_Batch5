package com.day2ex;

import java.util.Scanner;

public class OddIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of inputs:");
		int s = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[s];
		
		for(int i=0;i<s;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(arr[0]+" ");
		for(int i = 0;i<s;i++) {
			if(i%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
