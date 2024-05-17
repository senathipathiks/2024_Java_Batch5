package com.day7;
import java.io.IOException;
import java.io.FileReader;

public class File4 {

	public static void main(String[] args)throws IOException {
		FileReader fin=new FileReader("D:\\Sample.txt");
		int ch;
		while((ch=fin.read())!=-1)
		{
			System.out.println(ch);
		}

	}

}
