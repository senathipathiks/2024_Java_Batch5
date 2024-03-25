package com.day5;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(50);
		hs.add(20);
		hs.add(10);
		hs.add(20);
		System.out.println(hs);
		
		TreeSet<Double> ts = new TreeSet<>();
		ts.add(1.0);
		ts.add(2.0);
		ts.add(5.0);
		ts.add(2.0);
		ts.add(1.0);
		ts.add(2.5);
		System.out.println(ts);
//		System.out.println(ts.size());
		ts.remove(1.0);
		System.out.println(ts);
		
		System.out.println(ts.ceiling(2.9));
		
		
		

	}

}
