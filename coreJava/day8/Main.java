package com.day8;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException {

		// text file
		FileReader fin=new FileReader("D:\\vs.txt");
		FileWriter fout = new FileWriter("D:\\vs1.txt");
		
// image file 
//		FileInputStream fin=new FileInputStream("C:\\Users\\vidhusha.virumandi\\Pictures\\xxx.jpg");
//		FileOutputStream fout = new FileOutputStream("D:\\vs1.jpg");
		
		int ch;
		while((ch=fin.read())!=-1) {
			fout.write((char)ch);
		}
		System.out.println("task completed");
		fin.close();
		fout.close();
	}

}


 
