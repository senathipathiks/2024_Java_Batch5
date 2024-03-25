package com.day5;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(10, "Jeeva");
		hm.put(40, "Gopi");
		hm.put(30, "Prince");
		hm.put(20, "Jeeva");
//		Set<Entry<Integer, String>> st  = hm.entrySet();
//		
//		for(Entry<Integer, String> d : st) {
//			System.out.println(d.getKey()+ " : " + d.getValue());
//		}
		System.out.println(hm);
		System.out.println(hm.size());

	}

}
