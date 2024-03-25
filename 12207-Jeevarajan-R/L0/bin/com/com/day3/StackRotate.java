package com.day3;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class StackRotate {

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
		System.out.println("Before rotating...");
		System.out.println(st);
		Collections.rotate(st, 3);
		System.out.println("After rotating...");
		System.out.println(st);

	}

}
