package com.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment {
	
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(45);
		list.add(1);
		list.add(18);
		list.add(7);
		list.add(64);
		
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		
	}
}
