package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class findTheTopBottomElementsGivenDtack {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Enter the number of Element :");
		int num = sc.nextInt();

		System.out.println("Enter the Elements :");
		for(int i=0; i<num; i++) {
			stack.push(sc.nextInt());
		}
		
		Integer top = stack.peek();
		System.out.println("The Top Element is :" +top);
		
		Integer bot = stack.get(0);
		System.out.println("Enter Bottum Elements :"+bot);
		
		
	}

}
