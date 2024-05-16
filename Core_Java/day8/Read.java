package com.day8;

import java.io.IOException;

public class Read {
	public static void main(String args[]) throws IOException {
		char c;
		c = (char)System.in.read();
		System.out.println(c);
		
		int n;
		n = System.in.read();
		System.out.println(n);
		System.err.print("This is error");
		}

}
