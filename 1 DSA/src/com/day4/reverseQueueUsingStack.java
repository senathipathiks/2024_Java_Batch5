package com.day4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverseQueueUsingStack {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		Queue<Integer> que1 = new LinkedList<>();
		
		Stack<Integer> stc = new Stack<>();
		
		System.out.println("Enter the no of Queue elements: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<num; i++) {
			que1.add(sc.nextInt());
		}
		
		for(int i=0; i<num; i++) {
			stc.add(que1.peek());
			que1.remove();
		}
		Collections.reverse(stc);
		System.out.println(stc);
	}

}
