package com.day2;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class StatckAssesment {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(40);
		stack.push(70);
		stack.push(30);
		stack.push(10);
		stack.push(80);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Collections.rotate(stack, n);
		System.out.println("The Rotated Stack is : " + stack);
	}

}








