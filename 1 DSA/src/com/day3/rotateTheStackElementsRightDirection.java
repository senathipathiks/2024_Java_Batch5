package com.day3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class rotateTheStackElementsRightDirection {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Enter the number of Element :");
		int num = sc.nextInt();

		System.out.println("Enter the Elements :");
		for(int i=0; i<num; i++) {
			stack.push(sc.nextInt());
		}
		System.out.println("How many rotation do you want?");
		int rot = sc.nextInt();
		
		Collections.rotate(stack,rot);
		System.out.println(stack);

	}

}
