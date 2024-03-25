package com.Presentation;

public class SelectionSort {
	
	static int[] selectionSort(int arr[]) {
		int n = arr.length;
		int temp;
		int min = arr[0];
		for(int i = 0; i < n-1;i++) {
			for(int j = i+1; j < n; j++) {
				if(min > arr[j]) {
					min = arr[j];					
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1, 2, 3, 4, 5};
		
		arr = selectionSort(arr);

	}

}
