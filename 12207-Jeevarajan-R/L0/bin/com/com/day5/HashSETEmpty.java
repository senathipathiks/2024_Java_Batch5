package com.day5;

import java.util.HashSet;

public class HashSETEmpty {

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
		System.out.println(hs.size());
		hs.removeAll(hs);
		System.out.println(hs);
		System.out.println(hs.size());

	}

}
