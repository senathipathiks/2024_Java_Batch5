package com.day2;

import java.util.Stack;

public class StackExamples {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.add(1,50);
		
		System.out.println(stack.isEmpty()); //false
		
		System.out.println(stack); //[10,20,30]
		
		stack.pop();
		System.out.println(stack); //[10,20]

		Integer topElement = stack.peek();
		System.out.println(topElement); //20
		
		System.out.println(stack); //[10,20]
	}

}
