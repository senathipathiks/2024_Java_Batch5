package com.day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n,s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");

		n = sc.nextInt();
        while(n!=0){
            s = s+n%10;
            n = n/10;
        }
        System.out.print(s);
	}
}
