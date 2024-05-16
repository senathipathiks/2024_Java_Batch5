package com.day6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		String no="5";
		 try {
			 int a=Integer.parseInt(no);
					 
		 }
		 catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("exception handled succesfully");
		}


	}


