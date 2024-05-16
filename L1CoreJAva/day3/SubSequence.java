package com.day3;
import java.util.*;
public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String str1 = s.next();
		String str2 = "";
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str1.length();j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					str2=str2+str.charAt(i);
					break;
				}
			}
		}
		System.out.println(str2);

	}

}
