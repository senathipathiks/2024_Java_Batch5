package com.day1;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = s.nextInt();
		System.out.println("Divisible by 3 and 5 are");
		for(int i = 1; i <= range; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i+" ");
			}
		}	

	}

}
