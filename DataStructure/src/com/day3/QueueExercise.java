package com.day3;

// Queue Examples.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExercise {

	public static void main(String[] args) {
		Queue <Integer> queue = new LinkedList<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		
		System.out.println(queue);
		
		System.out.println("The First Element of the Queue :" + queue.peek());
		
		queue.poll();
		System.out.println(queue);
		
		for(Integer obj : queue) {
			System.out.println(obj);
		}
		System.out.println("-------------------------------------");
		
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------------------");
		
		queue.stream().forEach(x -> System.out.println(x));
		System.out.println("--------------------------------------");
		
		while( !queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println("--------------------------------------");
		
		for(;!queue.isEmpty();) {
			System.out.println(queue.poll());
		}
	}

}




	