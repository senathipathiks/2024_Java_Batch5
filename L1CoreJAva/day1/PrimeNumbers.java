package com.day1;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Start range: ");
		int start = s.nextInt();
		System.out.print("Enter End range: ");
		int end = s.nextInt();
		
		
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
