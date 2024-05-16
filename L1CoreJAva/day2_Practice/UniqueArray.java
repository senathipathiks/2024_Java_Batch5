package com.day2_Practice;
import java.util.*;
import java.util.Scanner;

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.println("All are unique");
		}
		else {
			System.out.println("Duplictes present");
		}

	}

}
