package com.day2;

import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;


public class LinkedListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Stack <Integer>stack = new Stack<>();
    	 stack.push(67);
    	 stack.push(69);
    	 stack.push(80);
    	 stack.push(55);
    	 stack.push(57);
    	 stack.push(44);
    	 
    	 Scanner sc = new Scanner(System.in);
    	 int n = sc.nextInt();
     
             Collections.rotate(stack, n);
           
           System.out.println("The stack after rotation is : " + stack);
           
	}
	

}
