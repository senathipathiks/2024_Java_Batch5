package com.day2ex;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String string1 = sc.next();
		String string2 = "";
		for(int i=string1.length()-1;i>=0;i--) {
			string2 += string1.charAt(i);
		}


		if(string1.equals(string2)) {
			 System.out.println("The given word is Palidrome!");
		}
		else {
			System.out.println("The given word is not a Palidrome!");			
		}
	}

}
