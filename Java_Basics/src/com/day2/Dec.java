package com.day2;

import java.util.Scanner;

public class Dec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Cipher key: ");
		String in = sc.next();
		char c[] = in.toCharArray();
		
		System.out.println("Decrypted Key is:");
		for(int i=0;i<c.length;i++) {
			if(c[i]!=0) {
				c[i]=(char) (c[i]-6);
				System.out.print(c[i]);
			}
		}
	}
}
