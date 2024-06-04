package com.day4;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TreeEg {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer,String> hashmap = new HashMap<>();
		
		for(int i = 0;i < n;i++) {
			int y = sc.nextInt();
		
		    String s = sc.next();
		    hashmap.put(y,s);
		}
		
		HashMap<Integer,String> hashmap2 = (HashMap) hashmap.clone();
		System.out.print("Shallow copy of the hashset is: " + hashmap.clone());
	    }
	      
	 
 }
	


