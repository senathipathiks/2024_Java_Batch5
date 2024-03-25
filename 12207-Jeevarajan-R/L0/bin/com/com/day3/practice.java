package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of. Names to be Entered : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++ ) {
			st.push(sc.nextInt());
		}
		System.out.println(st.search(sc.nextInt()));
		System.out.println(st);
	}

}
