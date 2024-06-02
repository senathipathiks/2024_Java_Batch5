package com.day2ex;

import java.util.Scanner;

public class Merge {
	static Scanner sc = new Scanner(System.in);
	
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void merge(int arr[], int s, int m, int r) {
		int n1 = m - s + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[s + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = s;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	
	
	static void sort(int arr[], int s, int r) {
		if (s < r) {
			int m = s + (r - s) / 2;

			sort(arr, s, m);
			sort(arr, m + 1, r);
 
			merge(arr, s, m, r);
	
		}
	}

	public static void main(String[] args) {
		
		System.out.print("Enter the no of inputs:");
		int x = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[x];
		
		for(int i=0;i<x;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The given array");
		printArray(arr);
		
		sort(arr,0,arr.length-1);
		System.out.println("The sorted array");
		printArray(arr);
		
	}

}
