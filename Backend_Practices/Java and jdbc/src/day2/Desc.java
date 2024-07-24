package day2;

import java.util.Scanner;

public class Desc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		

		for(int i=0; i<size; i++) {
			
			System.out.println("Enter the " + i + " element: ");
			 array[i] = scanner.nextInt();
		}
		
		for(int i:array) {
			System.out.println(i);
		}
		
		for(int j=0; j<size-1;j++) {
			for(int k=0;k<size-j-1;k++) {
				if(array[k] > array[k+1]) {
					int temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array: ");
		for(int j:array) {
			System.out.println(j);
		}
		
		int start = 0;
		int end = array.length - 1;
		while(start< end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println("Descending Ordered array: ");
		for(int k:array) {
			System.out.println(k);
		}
		
		
		
	}

}
