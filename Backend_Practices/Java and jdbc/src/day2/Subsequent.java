package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Subsequent {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		int array2[] = new int[size];

		int maxlen = 1;

		for(int i=0; i<size; i++) {
			
			System.out.println("Enter the " + i + " element: ");
			 array[i] = scanner.nextInt();
		}
		
	    System.out.println(Arrays.toString(array));
	    
	    
	    
	    for(int i=0;i<size;i++) {
	    	array2[i]=1;
	    }
	    
	    for(int j=1;j<size;j++) {
	    	for(int k=0;k<j;k++) {
	    		if(array[j] > array[k]) {
	    			array2[j] = Math.max(array2[j], array2[k]) + 1; 
	    			maxlen = Math.max(maxlen, array2[j]);
	    		}
	    	}
	    }
	    
	   
		
	    System.out.println("Longest Subsequent is : "+ maxlen);
	}

}
