package com.day4;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

	public class TreeEx {

		public static void main(String[] args) {
			
			TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		
		
			set.add(10);
			set.add(20);
			set.add(30);
			set.add(40);
			set.add(50);
		
			System.out.println(set);
			
			set.remove(10);   //element removed
			
			System.out.println(set.remove(10));  //it will display true or false
			
			System.out.println(set);
			
			System.out.println("-------------------------------");
		
			for(Integer obj : set) {
				System.out.println(obj);
			}
			
			System.out.println("--------------------------------");
		
			Iterator<Integer> it = set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			System.out.println("--------------------------------");
			
			System.out.println(set.headSet(10));
			System.out.println(set.tailSet(10));

	}

}
