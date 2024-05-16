package Multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("D:\\sample.txt");
		FileOutputStream fout=new FileOutputStream("D:\\sample1.txt");
		int ch;
		while((ch=fin.read())!=-1) {
			fout.write((char)ch); // copy the content from sample and put it to the sample1
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();
	}
}
