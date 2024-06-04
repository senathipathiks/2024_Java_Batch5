package com.day3;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class QueueEg {
              
	        public static void main(String [] args ) {
	        	Queue<Integer> queue = new LinkedList<> (); 
                  
	        	queue.offer(89);
	        	queue.offer(79);
	        	queue.offer(99);
	        	queue.offer(49);
	        	
	        	Stack <Integer> stack = new Stack<>();
	        	while(!queue.isEmpty()) {
	        		stack.push(queue.poll());
	        	}
	        	
	        	while(!stack.isEmpty()) {
	        		queue.offer(stack.pop());
	        	}
	        	System.out.print(queue);
	        	 	
	         
	            }
	           
	        
	        
	       }
	        

