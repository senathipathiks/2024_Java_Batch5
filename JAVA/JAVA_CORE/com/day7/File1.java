package com.day7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class File1 {

	public static void main(String[] args)throws IOException {
		FileInputStream fin = new FileInputStream("D:\\imagesANI.png");
		FileOutputStream fot=new FileOutputStream("D:\\ani.png");
		
		int ch;
		while((ch=fin.read())!=-1)
		{
			fot.write((char)ch);
		}
		System.out.println("Task completed");
		fin.close();
		fot.close();
	}

}
