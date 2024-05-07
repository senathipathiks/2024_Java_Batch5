package com.day2;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Input String :");
	         
	     String str = sc.nextLine();
	     char ch [] = str.toCharArray();
	     int l=ch.length-1;
	     for(int i=0;i<ch.length;i++)
	     {
	    	 if(ch[i]!=ch[l]) {
	    		 System.out.println("String is Not a Palindrome!");
	    		 return;
	    	 }l--;
	     }
	     System.out.println("String is a Palindrome!");
	     
	}

}
