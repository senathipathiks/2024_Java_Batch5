package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) throws IOException {
//		FileInputStream fin = new FileInputStream("D:\\welcome.txt");
//		FileOutputStream fout = new FileOutputStream("D:\\welcome1.txt");
//		FileInputStream fin = new FileInputStream("C:\\Users\\aravinda.p\\Desktop\\causal.jpg");
//		FileOutputStream fout = new FileOutputStream("C:\\Users\\aravinda.p\\Desktop\\valid.jpg");
		FileInputStream fin = new FileInputStream("C:\\Users\\aravinda.p\\Desktop\\L0 Problem Solving final Assessment-12219-Aravinda Rajan P.pdf");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\aravinda.p\\Desktop\\main.pdf");
		
		int ch;
		while((ch = fin.read())!=-1) {
			fout.write((char)ch);
		}
		System.out.println("Task completed");
		fout.close();
		fin.close();
		

	}

}
