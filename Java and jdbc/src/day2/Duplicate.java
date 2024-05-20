package day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		

		for(int i=0; i<size; i++) {
			
			System.out.println("Enter the " + i + " element: ");
			 array[i] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		
		Set <Integer> set = new HashSet<>();
		Set <Integer> duplicates = new HashSet<>();
		
		for(int i:array) {
			if(!set.add(i)) {
				duplicates.add(i);
			}
		}
		
		System.out.println("Duplicates elements in an array: " + duplicates);
		
	}

}
