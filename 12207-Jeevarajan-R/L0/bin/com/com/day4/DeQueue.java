package com.day4;

import java.util.*;

public class DeQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq = new ArrayDeque();
		
		dq.offer(10);
		dq.offer(20);
		dq.offer(30);
		dq.offer(40);
		
		System.out.println(dq);
		
		dq.offerFirst(05);
		dq.offerLast(50);
		System.out.println(dq);
		dq.pollFirst();
		System.out.println(dq);
		dq.pollLast();
		System.out.println(dq);
		

	}

}
