package com.day5;

import java.util.HashMap;
import java.util.Scanner;

public class associateSpecifiedValueWithSpecifiedKeyHashMap {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in map :");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements :");
		for(int i=0; i<num; i++) {
			System.out.println("key.value");
			map.put(sc.nextInt(),sc.nextInt());
			
		}
		
		System.out.println(map);
		System.out.print("Enter the key to display : ");
		int key = sc.nextInt();
		System.out.println(map.get(key));
	}

}
