package com.day4;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapAssesment {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Ram");
		map.put(2, "Sam");
		map.put(3, "Dam");
		map.put(4, "Mam");
		map.put(5, "Nam");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean k = map.containsValue(s);
		System.out.println(k);

	}

}
