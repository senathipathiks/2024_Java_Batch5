package com.day3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class sortStackInDescendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Enter the number of Element :");
		int num = sc.nextInt();

		System.out.println("Enter the Elements :");
		for(int i=0; i<num; i++) {
			stack.push(sc.nextInt());
		}
		
		Collections.sort(stack);
		Collections.reverse(stack);
		System.out.println(stack);
	}
}
