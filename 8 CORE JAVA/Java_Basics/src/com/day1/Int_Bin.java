package com.day1;

import java.util.Scanner;

public class Int_Bin {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		int binary [] = new int[35];
		int id = 0;
		while(num>0) {
			binary[id++] = num%2;
			num = num / 2;
		}
		
		for (int i = id-1;i>=0;i--) {
			System.out.print(binary[i] + " ");
		}
	}

}
