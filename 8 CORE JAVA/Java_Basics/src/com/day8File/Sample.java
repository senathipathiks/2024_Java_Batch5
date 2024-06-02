package com.day8File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class Sample {
	public static void main(String args[]) throws IOException {
//		char c;
//		c = (char)System.in.read();
//		System.out.println("This is Out " + c);
//		System.err.println("This is error");
		FileInputStream fin = new FileInputStream("D:\\File IO\\video1.mp4");
		FileOutputStream fout = new FileOutputStream("D:\\File IO\\video5.mp4");
		int ch;
		while ((ch = fin.read()) != -1) {
			fout.write((char)ch);
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();
	}
	
}
