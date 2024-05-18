package Exceptionhandling.java;

import java.io.FileInputStream;


public class ExceptionDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		Class class1 = Class.forName("simple");
		}
		catch(ClassNotFoundException e){
			System.out.println("File not found");
		}
		System.out.println("Exception handled successfully" );

	}

}
