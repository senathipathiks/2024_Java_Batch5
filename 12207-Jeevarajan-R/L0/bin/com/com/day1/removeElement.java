package com.day1;

import java.util.Scanner;
public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int element = 4;
		int[] arr = new int[element];
		
		System.out.println("Enter "+ element + " Elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the to be Removed Element : ");
		int remove = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(remove== arr[i]) {
				arr[i] = 0;
				System.out.println(remove + " Element is Removed!!!");
				break;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
