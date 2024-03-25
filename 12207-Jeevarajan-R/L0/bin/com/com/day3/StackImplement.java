package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackImplement {
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
		System.out.println(st);
		
		//Pop top element
		System.out.println("Printing After Poping top element");
		st.pop();
		System.out.println(st);
		
		//Printing top element
		System.out.println("Printing top element");
		System.out.println(st.peek());
		
		//Printing the Stack is empty or not
		System.out.println("Is the Stack is empty or not");
		System.out.println(st.isEmpty());
		
		
		
		

	}

}
