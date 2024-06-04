package com.day4;

import java.util.HashSet;
import java.util.Iterator;

public class HashEx {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println(set);
		
		set.remove(10);
		System.out.println(set);
		
		for(Integer obj : set) {
			System.out.println(obj);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
