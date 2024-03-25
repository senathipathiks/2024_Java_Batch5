package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of. Elements to be Entered : ");
		int num = sc.nextInt();
		
		//Push no.of.elements
		System.out.println("Enter elements");
		for(int i = 0; i < num; i++ ) {
			st.push(sc.nextInt());
		}
		Stack<Integer> s2 = new Stack<>();
		for(int i = 0; i < st.size(); i++) {
			int a = st.get(i);
			if(!s2.contains(a)) {
				s2.push(a);
			}
		}
		System.out.println(s2);

	}

}
