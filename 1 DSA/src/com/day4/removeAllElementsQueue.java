package com.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class removeAllElementsQueue {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		Queue<Integer> que1 = new LinkedList<>();
		
		System.out.println("Enter the no of Queue elements: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<num; i++) {
			que1.add(sc.nextInt());
		}
		
		System.out.println("Before removing ");
		System.out.println(que1);
		
		que1.clear();
		
		System.out.println("Enter the elements: ");
		System.out.println(que1);
	}

}
