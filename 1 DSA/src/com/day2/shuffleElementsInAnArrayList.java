package com.day2;

import java.util.ArrayList;
import java.util.*;

public class shuffleElementsInAnArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the no of Element :");
		int no=sc.nextInt();
		
		for(int i=0; i<no; i++) {
			list.add(sc.nextInt());
		}

		Collections.shuffle(list);
		System.out.println(list);
	}

}
