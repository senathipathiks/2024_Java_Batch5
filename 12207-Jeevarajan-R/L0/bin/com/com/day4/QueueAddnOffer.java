package com.day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAddnOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		
		q.add(10);
		q.offer(20);
		q.add(60);
		q.offer(50);
		
		System.out.println(q);

	}

}
