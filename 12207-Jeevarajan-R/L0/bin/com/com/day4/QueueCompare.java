package com.day4;

import java.util.*;

public class QueueCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> dq = new LinkedList<>();
		dq.offer(10);
		dq.offer(20);
		dq.offer(30);
		dq.offer(40);
		
		System.out.println(dq);
		
		Queue<Integer> dq2 = new LinkedList<>();
		dq2.offer(10);
		dq2.offer(20);
		dq2.offer(30);
		dq2.offer(50);
		
		System.out.println(dq2);
		
		int sq1 = dq.size();
		int sq2 = dq2.size();
		System.out.println(dq.equals(dq2));
		if(sq1 == sq2) {
			Iterator<Integer> q1 = dq.iterator();
			Iterator<Integer> q2 = dq2.iterator();
			while(q1.hasNext()) {
				int n = q1.next();
				int n1 = q2.next();
				if(n1 == n) {
					System.out.println(n + " = " + n1);
				}
				else {
					System.out.println(n + " != "+n1);
				}
			}
			
		}

	}

}
