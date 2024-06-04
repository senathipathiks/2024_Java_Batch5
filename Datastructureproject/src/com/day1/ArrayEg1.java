package com.day1;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		
        	 LinkedList <Integer>List = new LinkedList<>();
        	 List.add(67);
        	 List.add(57);
        	 List.add(99);
        	 List.add(7);
        	
        	 System.out.println(List);
        	 List.add(1,40);
        	 for(int i = 0; i < List.size(); i++) {
        		 System.out.println(List.get(i));
        	 }
        	 
        	 for(int obj : List) {
        		 System.out.println(obj);
        	 }
		
		    	
	}
         }
	


 