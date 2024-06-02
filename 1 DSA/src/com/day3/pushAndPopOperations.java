package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class pushAndPopOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Enter the number of Element :");
		int num = sc.nextInt();

		System.out.println("Enter the Elements :");
		for(int i=0; i<num; i++) {
			stack.push(sc.nextInt());
		}
		
		stack.pop();
		
		System.out.println("The top Element is :"+ (stack.peek()));
		
		if(stack.isEmpty()) {
			System.out.println("The Stack is empty.");
		}
		else {
			System.out.println("The stack is not empty.");
		}
		
	}

}
