package com.day4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Ram");
		map.put(2, "Sam");
		map.put(3, "Dam");
		map.put(4, "Mam");
		map.put(5, "Nam");
		
//		map.put(1, "Gam");
		System.out.println(map);
		
		System.out.println("--------------------------");
		
		System.out.println(map.get(3)); //Dam
		
		System.out.println("--------------------------");
		
		map.remove(5);
		System.out.println(map);
		
		System.out.println("--------------------------");
		
		//Iterating the map		
		// Way - 1
		Set<Integer> set = map.keySet();
		System.out.println(set);
		
		for(Integer key : set) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("--------------------------");
		
		// Way - 2
		Set<Entry<Integer,String>>set1 = map.entrySet();
		System.out.println(set1);
		
		System.out.println("--------------------------");
		
		for(Entry<Integer,String> entry : set1) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
