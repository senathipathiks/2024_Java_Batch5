package com.day1;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
