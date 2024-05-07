package com.day1;

import java.io.InputStream;
import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int n,s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");

		n = sc.nextInt();
        while(n!=0){
            s = s*10+n%10;
            n = n/10;
        }
        System.out.print(s);
	}
}

