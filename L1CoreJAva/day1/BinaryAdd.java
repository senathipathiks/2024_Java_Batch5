package com.day1;
import java.util.*;
public class BinaryAdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Binary Number");
		String bin1 = s.next();
		System.out.println("Enter the second Binary Number");
		String bin2 = s.next();
		int num1 = Integer.parseInt(bin1,2);
		int num2 = Integer.parseInt(bin2,2);
		int res = num1+num2;
		System.out.println("The Sum of 2 numbers is: "+res);
		s.close();
	}

}
