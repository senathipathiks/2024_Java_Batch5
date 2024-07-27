package com.day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContents {

	public static void main(String[] args)throws IOException {
		FileInputStream f = new FileInputStream("D:\\DS Call.txt");
		FileOutputStream fout = new FileOutputStream("D:\\FileOutExample1.txt"); 
		int ch;
		while((ch = f.read()) != -1 ) {
			fout.write((char)ch);
		}
		
		System.out.println("--------------");
		System.out.println("Task Completed");
		
		f.close();
		fout.close();
		
	}
}
