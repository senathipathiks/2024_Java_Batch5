package com.day2;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String in = sc.next();
		char ch[] = in.toCharArray();
		char in1[] = new char[in.length()];
		boolean flag = false;
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1; j <ch.length;j++) {
				if(ch[i] == ch[j]) {
					in1[i]=ch[i];
					System.out.println(in1[i]+" ");
					flag = true;
				}
			}
		}
		if( flag == false) {
			System.out.println("No Duplicates present");
		}
	}

}
