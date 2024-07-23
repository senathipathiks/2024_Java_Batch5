package com.day1;

import java.util.Scanner;

public class Int_Bin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Integer to Binary Conversion***");
		System.out.println("Enter the Integer: ");
		int in = sc.nextInt();
		
//		int bin,temp=0;
//		
//		while(in>=0) {
//			temp = temp + (in % 2);
//			in = in / 2;
//		}
//		
//		System.out.println("Binary Value is: "+in);
		
		System.out.println("Binary Value is: "+Integer.toBinaryString(in));
	}
}