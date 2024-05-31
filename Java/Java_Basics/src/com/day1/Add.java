package com.day1;

public class Add {
	public static void main(String args[]){
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[2]);
		System.out.println("HI");
		if(args[0].equals("add")){
		System.out.println("Addition is:"+(a+b));
		}
		else if(args[0].equals("sub")){
		System.out.println("Subtraction is:"+(a-b));
		}
		else if(args[0].equals("mul")){
		System.out.println("Multiplication is:"+(a*b));
		}
		else if(args[0].equals("sub")){
		System.out.println("Division is:"+(a/b));
		}
		}
}
