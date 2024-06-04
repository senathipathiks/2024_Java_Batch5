package com.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPrograms {

	public static void main(String[] args) {
		
		LinkedList <String> list = new LinkedList<>();
		list.add("Ram");
		list.add("Sam");
		list.add("Tom");
		list.add("Mon");
		list.add("Don");
		
		list.addFirst("Gana");
		list.addLast("nagusankar");
		
		list.getFirst();
		list.getLast();
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		int index = -1;
//		
//		for(int i = 0; i < list.size(); i++) {
//			String num = list.get(i);
//			if(num.equals(s)) {
//				index = i;
//				System.out.println("Index is " +i);
//				break;
//				
//			}
//			
//		}
//		if(index == -1) {
//			System.out.println("NO the element is not present");
//		}

	}

}

