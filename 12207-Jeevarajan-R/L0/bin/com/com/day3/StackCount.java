package com.day3;
import java.util.Scanner;
import java.util.Stack;

public class StackCount {

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
		
		System.out.print("The size of Stack : ");
		System.out.println(st.size());

	}

}
