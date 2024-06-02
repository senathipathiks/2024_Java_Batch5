package com.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class compareTwoQueues {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);

		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		
		System.out.println("Enter the no of Queue-1 elements: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<num; i++) {
			que1.add(sc.nextInt());
		}
		
		System.out.println("Enter the no of Queue-2 elements: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<num1; i++) {
			que2.add(sc.nextInt());
		}
		

		if(que1.equals(que2)) {
			System.out.println("two queues are same");
		}
		else {
			System.out.println("two queues are not same");
		}

		
		
		
		
		

	}

}
