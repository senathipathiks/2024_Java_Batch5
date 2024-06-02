package com.day2ex;

import java.util.Scanner;

public class DuplicateChar {

	public static void main	(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] ch= str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			int count = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!=' ') {
					count++;
					ch[j]='-';
				}
			}
			if(count>1 && ch[i]!='-') {
				System.out.print(ch[i]+" ");
			}
		}
	}

}
