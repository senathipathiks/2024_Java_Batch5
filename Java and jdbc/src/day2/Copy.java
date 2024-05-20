package day2;

import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		int copy[] = new int[size];

		for(int i=0; i<size; i++) {
			
			System.out.println("Enter the " + i + " element: ");
			 array[i] = scanner.nextInt();
		}
		
		for(int i:array) {
			System.out.print(i);
		}
		
		copy = array;
		
		System.out.println("Copied array: ");
		
		for(int j:copy) {
			System.out.print(j);
		}
		
	}

}
