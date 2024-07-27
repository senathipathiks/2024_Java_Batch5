package com.day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Digits:");
		int num =  sc.nextInt();
		int rem=0,sum=0;
		
		while(num>0) {
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		
		System.out.println("Sum of the Digits are:"+sum);
	}

}
