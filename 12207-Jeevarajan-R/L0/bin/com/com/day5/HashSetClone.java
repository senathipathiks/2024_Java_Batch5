package com.day5;

import java.util.HashSet;

public class HashSetClone {

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
		
		HashSet<Integer> h2 = new HashSet<>(hs);
		System.out.println("Hash Set 2 : ");
		System.out.println(h2);
		

	}

}
