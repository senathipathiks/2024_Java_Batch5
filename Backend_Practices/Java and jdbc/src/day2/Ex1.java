package day2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

//		int arr[] = new int[] {1,2,3,4,5};
		
		Scanner sing = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		
		int size = sing.nextInt();

		
		int arr[] = new int[size];
		
		int arr1[] = new int[size];
		
		int arr2[] = new int[size];


		
		for(int i=0; i<size;i++) {
			System.out.println("Enter the "+i+" Element: ");
			 arr[i] = sing.nextInt();
			}
		for(int i:arr) {
			System.out.println(i);
		}
		
		System.arraycopy(arr, 0, arr1, 0, size);
		
		for(int i:arr1) {
			System.out.println(i);
		}
		
		arr2 = arr1;
		
		for(int i:arr2) {
			System.out.println(i);
		}
		
		
	}

}
