package com.day5;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Dasy5_6 {

	public static void main(String[] args) {
		try
		{
			FileInputStream fin= new FileInputStream("D://n.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		

	}

}
