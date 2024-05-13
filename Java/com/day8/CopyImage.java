package com.day8;

import java.io.*;

public class CopyImage {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\Karthi R K\\image1.jpg");
		FileOutputStream fout = new FileOutputStream("D:\\Karthi R K\\image2.jpg");
		int ch;
		while((ch = fin.read()) != -1) {
			fout.write((char)ch);
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();
	}
}
