package com.day1;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range = in.nextInt();
		
		
		for(int i=2; i<=range; i++) {
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
