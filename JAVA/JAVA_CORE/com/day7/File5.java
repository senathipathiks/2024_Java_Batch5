package com.day7;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class File5 {

	public static void main(String[] args)throws IOException {
		FileReader fin=new FileReader("D:\\Sample.txt");
		FileWriter win=new FileWriter("D:\\Sample1.txt");
		int ch;
		while((ch=fin.read())!=-1)
		{
			win.write(ch);
		}
		System.out.println("ANI");
	}

}
