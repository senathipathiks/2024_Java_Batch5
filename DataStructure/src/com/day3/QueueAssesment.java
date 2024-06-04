package com.day3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueAssesment {

	public static void main(String[] args) {
		
		Queue <Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(40);
		queue.offer(30);
		queue.offer(70);
		
		Stack <Integer> stack = new Stack <>();
		
		while( !queue.isEmpty()) {
			stack.push(queue.poll());
		}
		
		while(!stack.isEmpty()) {
			queue.offer(stack.pop());
		}
		
		System.out.println(queue);
	}
	
}
