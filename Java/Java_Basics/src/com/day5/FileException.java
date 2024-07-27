package com.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException {

	public static void main(String[] args) throws FileNotFoundException {
//		try {
//			FileInputStream fin = new FileInputStream("D://new.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("File not found!!! \n"+e);
//		}

		try {
			FileInputStream fin = new FileInputStream("D:\\new.txt");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
