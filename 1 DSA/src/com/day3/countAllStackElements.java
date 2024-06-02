package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class countAllStackElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Enter the number of Element :");
		int num = sc.nextInt();

		System.out.println("Enter the Elements :");
		for(int i=0; i<num; i++) {
			stack.push(sc.nextInt());
		}
		
		System.out.println("The Minimum is Empty : "+ stack.size());

	}

}
