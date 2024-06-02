package com.day5;

import java.util.HashMap;

public class practice {

	public static void main(String[] args) {
		HashMap<Integer,Integer> set = new HashMap<>();
		
		set.put(1,12);
		set.put(2,341);
		set.put(3,13);
		set.put(4,12);
		
		System.out.println(set);
		
		System.out.println(set.get(3));
		
		
	}
}