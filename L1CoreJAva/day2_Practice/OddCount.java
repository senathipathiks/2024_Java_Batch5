package com.day2_Practice;

import java.util.Scanner;

public class OddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i+=2) {
			count++;
		}
System.out.println(count);
	}

}
