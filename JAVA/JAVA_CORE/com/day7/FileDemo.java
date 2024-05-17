package com.day7;
import java.io.FileInputStream;
import java.io.IOException;
public class FileDemo {
	public static void main(String args[])throws IOException
	{
		FileInputStream fin = new FileInputStream("D:\\Sample.txt");
		int ch;
		while((ch=fin.read())!=-1)
		{
			System.out.println((char)ch);
		}
	}

}
