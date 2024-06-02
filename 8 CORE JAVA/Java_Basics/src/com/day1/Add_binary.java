package com.day1;

import java.util.Scanner;

public class Add_binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the 1st binary number : ");
		long x = sc.nextLong();
		System.out.print("Enter the 2nd binary number : ");
		long y = sc.nextLong();
		
		int num1 = 0,i = 0;
		long rem1;
		while(x != 0) {
			rem1 = x % 10;
			x = x / 10;
			num1 += rem1 * Math.pow(2,i);
			i++;
		}
		System.out.println("The 1st number is : " + num1);
		
		int num2 = 0,j = 0;
		long rem2;
		while(y != 0) {
			rem2 = y % 10;
			y = y / 10;
			num2 += rem2 * Math.pow(2,j);
			j++;
		}
		
		System.out.println("The 2nd number is : " + num2);
		
		int sum = num1 + num2 ;
		
		System.out.println("The Add value is : " + sum);
		
		int binary [] = new int[35];
		int id = 0;
		while(sum>0) {
			binary[id++] = sum%2;
			sum = sum / 2;
		}
		
		for (int k = id-1;k>=0;k--) {
			System.out.print(binary[k] + " ");
		}

	}

}
