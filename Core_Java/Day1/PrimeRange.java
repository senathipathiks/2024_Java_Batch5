package com.day1;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Start range");
		int srange = s.nextInt();
		System.out.println("End range");
		int erange = s.nextInt();
		for(int i = srange ; i <= erange ; i++) {
			boolean flag = false;
			for(int j = 2 ; j <= i/2 ; j++) {
				if(i%j == 0) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("prime numbers are "+i);
			}
			
		}
		

	}

}
