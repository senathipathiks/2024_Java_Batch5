package com.day2;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String in = sc.nextLine();
		String rev = "";
		boolean flag =false;
		
		for(int i = in.length()-1 ; i >= 0 ; i--) {
			rev+=in.charAt(i);
		}
			if(in.equals(rev)) {
				flag = true;
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not a palindrome");
			}
	}

}
