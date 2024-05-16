package com.day1;
import java.util.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String r="";
		String str = "";
		while(n>0) {
			int res = n%2;
			r = r+res;
			n = n/2;
		}
//		System.out.println(r);
		for(int i=r.length()-1;i>=0;i--) {
			str+= r.charAt(i);
		}
		System.out.println(str);
 
	}
 

	}

