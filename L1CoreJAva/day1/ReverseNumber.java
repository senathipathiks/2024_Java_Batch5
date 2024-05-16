package com.day1;

import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev=0;
		while(n>0) {
			rev=(rev*10)+n%10;
			n/=10;
		}
		n=rev;
		System.out.print(n);
		

	}

}
