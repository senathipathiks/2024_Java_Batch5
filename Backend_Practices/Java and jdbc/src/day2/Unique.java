package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Unique {

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
		
		boolean isUnique;
		
		for(int j=0;j<size;j++) {
			
			isUnique = true;
			
			for(int k=0; k<size;k++) {
				if(j != k && array[j] == array[k]) {
					isUnique = false;
					break;
				}
				
			}
			if(isUnique) {
				System.out.println(array[j]);
			}
		}
		
		
		
		
	}

}
