package com.day5;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Day5_7 {

	public static void main(String[] args) {
		try
		{
			Class class1=Class.forName("SIMPLE");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("FILE NOT FOUND");
		}
		
		

	}

}
