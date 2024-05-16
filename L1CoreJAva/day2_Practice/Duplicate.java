package com.day2_Practice;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int flag=0;
		int temp[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					temp[i]=arr[i];
					System.out.print("The Duplicate Values are:"+temp[i]+" ");
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.print("Nothing");
		}

	}

}
