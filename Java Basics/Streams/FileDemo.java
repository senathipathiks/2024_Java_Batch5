package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\PORIE.txt");
		FileOutputStream fout = new FileOutputStream("D:\\PORIECOPY.txt");
		int ch;
		while((ch=fin.read())!= -1) {
			
//			System.out.print((char)ch);
			fout.write((char)ch);
		}
		System.out.println("task completed");
	}

}
