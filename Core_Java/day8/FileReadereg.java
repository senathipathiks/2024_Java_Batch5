package com.day8;

import java.io.*;
public class FileReadereg {

	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("D://welcome.txt");
		FileWriter fout = new FileWriter("D://welcomefinal.txt");
		int ch;
		while((ch = fin.read())!=-1) {
			System.out.print((char)ch);
			fout.write((char)ch);
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();
	}

}
