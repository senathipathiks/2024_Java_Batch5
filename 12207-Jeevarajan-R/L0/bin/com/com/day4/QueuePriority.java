package com.day4;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityQueue<>();
		
		q.offer(10);
		q.offer(50);
		q.offer(60);
		q.offer(20);
		q.offer(30);
		
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
		System.out.println("Reverse Order : ");
		
		Queue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
		
		q1.offer(10);
		q1.offer(50);
		q1.offer(60);
		q1.offer(20);
		q1.offer(30);
		
		
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		
		System.out.println("Using Comparator : ");
		
		Queue<Integer> q2 = new PriorityQueue<>(Comparator.reverseOrder());
		
		q2.offer(10);
		q2.offer(50);
		q2.offer(60);
		q2.offer(20);
		q2.offer(30);
		
		System.out.println(q2);
		q2.poll();
		System.out.println(q2);
		q2.poll();
		System.out.println(q2);
		

	}

}
