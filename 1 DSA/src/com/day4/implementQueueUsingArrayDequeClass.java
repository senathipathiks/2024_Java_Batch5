package com.day4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class implementQueueUsingArrayDequeClass {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			
			Deque<Integer> dque = new ArrayDeque<>();
			
			System.out.println("Enter the no of elements: ");
			int num = sc.nextInt();
			
			System.out.println("Enter the elements: ");
			for(int i = 0; i<num; i++) {
				dque.add(sc.nextInt());
			}
			
			System.out.println(dque);
	}

}
