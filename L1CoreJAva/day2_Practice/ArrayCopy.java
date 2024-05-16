package com.day2_Practice;
import java.util.*;
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		int arr1[] = new int[arr.length];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		arr1=arr;
			for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
			}
		}

	}

