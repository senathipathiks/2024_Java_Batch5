package com.day2;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Input String :");
	         
	     String str = sc.nextLine();
		 
	     String[] a = str.split("\\s");
		         
		 for (int i = a.length-1; i >= 0; i--)
         {
	        	System.out.print(a[i]+" ");
	     }
		         
	}

}
