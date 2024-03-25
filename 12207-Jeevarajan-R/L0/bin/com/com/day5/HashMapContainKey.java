package com.day5;

import java.util.HashMap;

public class HashMapContainKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(10, "Jeeva");
		hm.put(40, "Gopi");
		hm.put(30, "Prince");
		hm.put(20, "Jeeva");

		System.out.println(hm);
		System.out.println(hm.containsKey(10));
		System.out.println(hm.get(10));


	}

}
