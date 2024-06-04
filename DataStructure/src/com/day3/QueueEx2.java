package com.day3;

// Deque Examples.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx2 {

	public static void main(String[] args) {
		Deque <Integer> queue = new LinkedList<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		
		System.out.println(queue);
		
		queue.offerFirst(45);
		queue.offerLast(55);
		
		System.out.println(queue);
		
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		
		queue.pollFirst();
		queue.pollLast();
		
		System.out.println(queue);
		
	}

}
