package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Odd {

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
		
		System.out.println("Odd Elements in an array: ");
		
		int odd=0, even = 0;
		
		for(int j:array ) {
			if(j%2 == 1) {
				odd++;
				System.out.println(j);
				
			}
			
		}
		System.out.println("Total Odd Elements: "+odd);
		
		System.out.println("Even Elements in an array: ");
		
		for(int j:array ) {
			
			if(j%2 == 0) {
				even++;
				System.out.println(j);
			}
			
		}
		System.out.println("Total Even Elements: "+even);
	}

}
