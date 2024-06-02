package com.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class removeItemFromQueue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Queue<Integer> que = new LinkedList<>();
		
		System.out.println("Enter the no of elements: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<num; i++) {
			que.add(sc.nextInt());
		}
		
		System.out.println(que);
		
		System.out.println("Enter the element index to remove : ");
		int rem = sc.nextInt();
	
		que.remove();
		
		System.out.println(que);

	}

}
