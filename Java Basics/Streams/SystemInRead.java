package Streams;

import java.io.IOException;

public class SystemInRead {

	public static void main(String[] args) throws IOException {
		
		char c;
		c = (char)System.in.read();
		System.out.println(c);
		System.err.println("This is error");

	}

}
