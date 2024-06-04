package com.day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("D:\\a.jpg");
		FileOutputStream fout = new FileOutputStream("D:\\b.jpg");
		int ch;
		while((ch = fin.read())!=-1)
		{
			fout.write((char)ch);
		}
		System.out.print("Task Completed");
		fin.close();
		fout.close();

	}

}
