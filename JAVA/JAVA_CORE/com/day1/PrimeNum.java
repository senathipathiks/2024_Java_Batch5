package com.day1;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Start range: ");
		int start = in.nextInt();
		System.out.print("Enter End range: ");
		int end = in.nextInt();
		
		
		for(int i=start; i<=end; i++) {
			boolean flag = false;
			for(int j=2;j<=(i/2);j++){      
			    if(i%j == 0){      
			    	flag=true;      
			    	break;      
			    }      
			}      
			if(flag==false)  { 
				System.out.println(i+" is prime number"); 
			} 
		}
	}
}