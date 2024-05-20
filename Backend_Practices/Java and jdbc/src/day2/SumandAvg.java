package day2;

import java.util.Scanner;

public class SumandAvg {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Size of an array: ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		int sum = 0;
		
		for(int i=0; i<size; i++) {
			
			System.out.println("Enter the " + i + " element: ");
			 array[i] = scanner.nextInt();
					 sum += array[i];
			 
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+ sum/size);
		
		
		
	}

}
