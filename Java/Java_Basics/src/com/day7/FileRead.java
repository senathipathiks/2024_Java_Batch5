package com.day7;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException{
		FileInputStream f = new FileInputStream("D:\\DS Call.txt"); 
		int ch;
		while((ch = f.read()) != -1 ) {
			System.out.print((char)ch);
		}
		
	}

}
