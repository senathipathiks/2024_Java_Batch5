package Multithreading;

import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		char c;
		c=(char)System.in.read();
		int a=System.in.read(); //it print ascii value of integer
		System.out.println(c);
		System.out.println(a);
	}
}
