package com.day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\payment.png");
		FileOutputStream fout = new FileOutputStream("D:\\Payment1.jpg");
		
		int ch;
		while((ch = fin.read()) != -1) {
			fout.write((char)ch);
		}
		
		System.out.println("Task Completed!!!");
		
		fin.close();
		fout.close();
	}

}
