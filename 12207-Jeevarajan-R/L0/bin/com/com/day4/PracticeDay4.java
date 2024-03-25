package com.day4;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class PracticeDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println(q);
		System.out.println("First Element of Queue : " + q.peek());
//		q.poll();
		Iterator<Integer> it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		q.stream().forEach(s -> System.out.print(" "+ s) );
		System.out.println("\n"+q);
		

	}

}
