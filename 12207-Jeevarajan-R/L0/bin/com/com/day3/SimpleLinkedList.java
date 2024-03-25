package com.day3;

import java.util.LinkedList;
import java.util.Scanner;

public class SimpleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
				
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(15);
		
		System.out.println(ls);
		
		ls.addFirst(2);
		ls.addLast(100);
		
		System.out.println(ls);
		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		ls.removeFirst();
		ls.removeLast();
		
		System.out.println(ls);

	}

}
