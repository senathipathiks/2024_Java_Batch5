package com.day2ex;

import java.util.Scanner;

public class Cryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Word for Encryption: ");
		String str = sc.next();
		
		char[] ch= str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			ch[i] = (char) (ch[i]+4);
		}
		String string = new String(ch);
		System.out.print("Encrypted word: ");
		System.out.println(string);
		
		char[] ch1= string.toCharArray();
		for(int i = 0;i<ch1.length;i++) {
			ch1[i] = (char) (ch1[i]-4);
		}
		String string1 = new String(ch1);
		System.out.print("Decrypted word: ");
		System.out.println(string1);
	}

}
