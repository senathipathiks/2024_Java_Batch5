package com.day3;

import java.util.Stack;

public class practice1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		
		stack.add(18);
		stack.remove(0);
		
		System.out.println(stack.contains(20));
		System.out.println(stack.size());
		System.out.println(stack.search(10));
		
		var x = 6;
		x = 80;
		System.out.println(x);
		var y=12.34;
		
		System.out.println(y);
	}

}
