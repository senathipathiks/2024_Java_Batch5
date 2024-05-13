package com.day8;

import java.io.*;

public class Fileinput {
	public static void main(String[] args) throws IOException{
//		FileInputStream fin = new FileInputStream("D:\\Karthi R K\\File1.txt");
//		FileOutputStream fout = new FileOutputStream("D:\\Karthi R K\\File2.txt");
		
		FileReader fin = new FileReader("D:\\Karthi R K\\File1.txt");
		FileWriter fout = new FileWriter("D:\\Karthi R K\\File2.txt");
		
		int ch;
		while((ch = fin.read()) != -1) {
			fout.write((char)ch);
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();
	}
}
