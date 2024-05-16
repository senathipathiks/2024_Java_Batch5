package com.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {

	public static void main(String[] args)  
	{
		try {
			FileInputStream fin = new FileInputStream("D://m.txt");
			}
		
		catch(FileNotFoundException e) {
			System.out.println("file not found");
			
		}
		System.out.println(" exception handled successfully ");
		
		
	}

}
