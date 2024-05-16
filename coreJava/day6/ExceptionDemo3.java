package com.day6;

public class ExceptionDemo3 {
	
public static void main(String[] args) {
		
		String no="vidhu";
		
		 try {
			 int a= no.charAt(5);
					 
		 }
		 catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("exception handled succesfully");
		}

}
