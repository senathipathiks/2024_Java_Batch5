package com.day1;
import java.util.Scanner;

public class IntBinary {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String res = "";
		String result="";
		int r;
		while(a!=0) {
			r = a % 2;
			res += r;
			a = a / 2;
		}
		System.out.println(res);
		for(int i = res.length()-1 ; i >= 0;i--) {
			result += res.charAt(i);
		}
		System.out.println("Binary="+result);
		
		
		
		
	}

}
