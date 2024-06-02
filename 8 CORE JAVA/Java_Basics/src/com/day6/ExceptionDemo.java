package com.day6;

public class ExceptionDemo {
	 public static void main(String args[]) {
		 int a = 20,b=0;
		 try {
			 int res = a/b; // run time exception
		 }
		 catch(Exception e){
			  System.out.print(e);
			  
		 }
		 System.out.println("Excepton handled successfully");
	 }
}
