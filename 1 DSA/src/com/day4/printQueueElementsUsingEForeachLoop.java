package com.day4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class printQueueElementsUsingEForeachLoop {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		Queue<Integer> que1 = new LinkedList<>();
		
		System.out.println("Enter the no of Queue elements: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<num; i++) {
			que1.add(sc.nextInt());
		}
		
		System.out.println("The elements are : ");
		for(int i : que1) { 
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println("Using Iterator The elements are : ");
		Iterator<Integer> it = que1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
