package Multithreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		
		FileReader fr =new FileReader("D:\\sample.txt");
		FileWriter fw=new FileWriter("D:\\sample2.txt");
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write((char)ch); 
		}
		System.out.println("Task Completed");
		fr.close();
		fw.close();
	}

}
