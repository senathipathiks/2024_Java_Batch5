package com.day1;

import java.util.*;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //908
		int sum=0;
		while(n>0) {
			int num = n%10;
			sum = sum + num;
			n/=10;
		}
		System.out.print(sum);
	}

}
