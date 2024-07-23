package com.day5;

public class ClassNotFound {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class class1  = Class.forName("Simple");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Exception handled!!!");
		}

	}

}
