package com.day8File;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("D:\\File IO\\video1.mp4");
		FileWriter fout = new FileWriter("D:\\File IO\\video3.mp4");
		int ch;
		while ((ch = fin.read()) != -1) {
			fout.write((char)ch);
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();

	}

}
