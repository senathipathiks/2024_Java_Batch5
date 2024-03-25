package com.day3;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchElementLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of. Names to be Entered : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++ ) {
			ls.add(sc.next());
		}
		
		LinkedList<String> ls2 = new LinkedList<>(ls);
		
		System.out.println("Enter the to be searched : ");
		String name = sc.next();
		
		ls.replaceAll(str -> str.toLowerCase());
		name = name.toLowerCase();
		
		if(ls.contains(name)) {
			for(int i = 0; i < ls.size(); i++) {
				if(ls.get(i).equals(name)) {
					System.out.println("Name " + name + " present in "+ i + " index.");
					ls = null;
					break;
				}
			}
		}
		else {
			System.out.println("OOOps!!! "+ name +" isnt present in the list");
		}
		System.out.println(ls2);

	}

}
