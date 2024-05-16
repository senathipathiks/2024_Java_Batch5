package com.day8;

import java.io.ByteArrayInputStream;

public class ByteArray {

	public static void main(String[] args) {
		byte[] s = new byte[] {1,2,3,4,5};
		ByteArrayInputStream bin = new ByteArrayInputStream(s);
		int ch;
		while((ch=bin.read())!=-1) {
			System.out.print(ch);
		}

	}

}
