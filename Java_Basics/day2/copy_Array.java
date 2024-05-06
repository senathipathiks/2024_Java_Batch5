package day2;

import java.util.*;

public class copy_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		int arr1[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("This is the original array : ");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			arr1[i] = arr[i];
		}
		System.out.print("This is the copied array : ");

		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}

}
