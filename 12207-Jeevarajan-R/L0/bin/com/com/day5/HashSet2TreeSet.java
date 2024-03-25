package com.day5;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet2TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(50);
		hs.add(20);
		hs.add(40);
		hs.add(60);
		System.out.println(hs);
		
		TreeSet<Integer> ts = new TreeSet<>(hs);
		
		System.out.println(ts);
		

	}

}
