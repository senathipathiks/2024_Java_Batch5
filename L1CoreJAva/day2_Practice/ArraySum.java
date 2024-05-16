package com.day2_Practice;
import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		for(int i=0;i<arr.length;i++) {
			avg=sum/10;
		}
		System.out.println(avg);
		}

}
