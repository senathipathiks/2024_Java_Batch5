package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class P4 {
	public static void mergeSort(int[] arr, int n) 
	{
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] left = new int[mid];
	    int[] right = new int[n - mid];

	    for (int i = 0; i < mid; i++) {
	    	left[i] = arr[i];
	    }
	    for (int i = mid; i < n; i++) {
	    	right[i - mid] = arr[i];
	    }
	    mergeSort(left, mid);
	    mergeSort(right, n - mid);

	    merge(arr, left, right, mid, n - mid);
	}
	public static void merge(int[] arr, int[] l, int[] r, int left, int right) 
	{
		int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            arr[k++] = l[i++];
	        }
	        else {
	            arr[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	        arr[k++] = l[i++];
	    }
	    while (j < right) {
	        arr[k++] = r[j++];
	    }
	}
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
	    int n = s.nextInt();
	    int arr[]= new int[n];
	    for (int i=0;i<n;i++) {
	    	arr[i]=s.nextInt();
	    }
	    mergeSort(arr, n);
	    System.out.println(Arrays.toString(arr));
	}
}