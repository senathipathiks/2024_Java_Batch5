package com.day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCheckEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		
		q.add(10);
		q.add(60);
		q.add(20);
		q.add(50);
		
		System.out.println(q);
		System.out.println("Queue is Empty? : "+ (q.isEmpty()? "Yes" : "No"));

	}

}