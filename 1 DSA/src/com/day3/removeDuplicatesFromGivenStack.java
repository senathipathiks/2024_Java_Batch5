package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class removeDuplicatesFromGivenStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack1 = new Stack<>();
		
		System.out.println("Enter the number of Element :");
		int num = sc.nextInt();

		System.out.println("Enter the Elements :");
		for(int i=0; i<num; i++) {
			stack.push(sc.nextInt());
		}
		
		for(int i=0; i<num; i++) {
			int count=0;
			for(int j=i+1; j<num; j++) {
				if(stack.get(i)==stack.get(j)) {
					count=1;
				}
			}
			if(count==0) {
				System.out.println(stack.get(i));
			}
		}
	}

}
