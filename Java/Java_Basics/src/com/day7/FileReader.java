package com.day7;

import java.io.IOException;
import java.io.*;

public class FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\DS Call.txt");
		FileWriter fw = new FileWriter("D:\\DS Call.txt");
		int ch;
		while((ch=fr.read()) != -1) {
			
		}
	}

}