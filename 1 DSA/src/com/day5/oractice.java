package com.day5;

import java.util.HashMap;
import java.util.Set;

public class oractice {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		map.put(5,12);
		map.put(2,341);
		map.put(3,3);
		map.put(7,12);
		
		System.out.println(map);
		
		Set<Integer> set = map.keySet();
		System.out.println(set);
		for(Integer key : set) {
			System.out.println(key + " : " + map.get(key));
		}
	}

}
