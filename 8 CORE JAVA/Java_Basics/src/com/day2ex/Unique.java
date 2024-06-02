package com.day2ex;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of inputs:");
		int s = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[s];
		
		for(int i=0;i<s;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<s;i++) {
			int count = 0;
			for(int j=0;j<s;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
