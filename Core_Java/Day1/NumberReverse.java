package com.day1;
import java.util.Scanner;
public class NumberReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int r;
		int rev = 0;
		while(num != 0) {
			r = num % 10;
			rev = rev*10 + r;  
			num = num/10;
			
		}
		/* String rev="";
		while(num != 0) {
			r = num % 10;
			rev += r;
			num = num/10;
		} */
		System.out.println("Reverse a number = "+rev);

	}

}
