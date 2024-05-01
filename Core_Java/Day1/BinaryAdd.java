package com.day1;
import java.util.Scanner;
public class BinaryAdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first binary");
		String a = s.next();//01
		System.out.println("Enter the second binary");
		String b = s.next();//10
		int ans1 = 0;
		int ans2 = 0;
		for(int i = a.length()-1, j = 0; i >= 0; i--) {
			int res = a.charAt(i) - '0';
			ans1 += res*Math.pow(2, j);
			j++;
		}
		
		for(int i = b.length()-1, j = 0; i >= 0; i--) {
			int res = b.charAt(i) - '0';
			ans2 += res*Math.pow(2, j);
			j++;
		}
		System.out.println("first number binary to int:"+ans1);
		System.out.println("second number binary to int:"+ans2);
		int sum = ans1 + ans2;
		System.out.println("final answer:"+sum);
		int n = sum;
		int r;
		String bres ="";
		while(n!=0) {
			r = n%2;
			bres += r;
			n = n/2;
		}
		String bfinal = "";
		for(int i = bres.length()-1; i >= 0; i--) {
			bfinal += bres.charAt(i);
		}
		System.out.println("binary answer="+bfinal);
		
	}

}
