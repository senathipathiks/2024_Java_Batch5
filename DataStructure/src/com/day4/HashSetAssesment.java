package com.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetAssesment {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		TreeSet<Integer> tree = new TreeSet<>(set);
		System.out.println(tree);
		
	}

}

