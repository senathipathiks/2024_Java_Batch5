package com.day5;

import java.util.HashMap;
import java.util.Scanner;

public class testIfMapContainsMappingForTheSpecifiedValue {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in map :");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements :");
		for(int i=0; i<num; i++) {
			System.out.println("Enter key,value");
			map.put(sc.nextInt(),sc.nextInt());
		}
		
		System.out.println("Enter the key value to find :");
		int x = sc.nextInt();
		if(map.containsValue(x)) {
			System.out.println("The key is present");
		}
		else
		System.out.println("The key is not present");
	}

}
