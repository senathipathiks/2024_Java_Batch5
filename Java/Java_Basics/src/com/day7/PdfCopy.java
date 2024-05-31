package com.day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\DS Call.txt");
		FileOutputStream fout = new FileOutputStream("D:\\DS.mp4");
		
		int ch;
		while((ch = fin.read()) != -1) {
			fout.write((char)ch);
		}
		
		System.out.println("Task Completed!!!");
		
		fin.close();
		fout.close();
	}

}
