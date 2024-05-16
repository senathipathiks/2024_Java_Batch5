package Multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("D:\\download.jpg");
		FileOutputStream fout=new FileOutputStream("D:\\download1.jpg");
		int ch;
		while((ch=fin.read())!=-1) {
			fout.write((char)ch); // copy the content from sample and put it to the sample1
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();

	}

}
