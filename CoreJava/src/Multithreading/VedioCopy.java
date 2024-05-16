package Multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VedioCopy {

public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("C:\\Users\\velan.chelladurai\\Pictures\\Camera Roll\\v1.mp4");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\velan.chelladurai\\Pictures\\Camera Roll\\v2.mp4");
		int ch;
		while((ch=fin.read())!=-1) {
			fout.write((char)ch); // copy the content from sample and put it to the sample1
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();

	}
}
