package com.day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(10, "Jeeva");
		hm.put(40, "Gopi");
		hm.put(30, "Prince");
		hm.put(20, "Jeeva");
		
		
		
		Set<Integer> s = hm.keySet();
		
		for(Integer i : s) {
			System.out.println(i + " : "+ hm.get(i));
		}
		
		System.out.println("--------------------------");
		
		Set<Entry<Integer, String>> st  = hm.entrySet();
		
		for(Entry<Integer, String> d : st) {
			System.out.println(d.getKey()+ " : " + d.getValue());
		}

	}

}
