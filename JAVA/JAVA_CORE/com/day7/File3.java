package com.day7;
import java.io.ByteArrayInputStream;

import java.io.IOException;

public class File3 {

	public static void main(String[] args)throws IOException ,ClassNotFoundException{
		byte[] s=new byte[] {1,2,3,4,5};
		ByteArrayInputStream bin = new ByteArrayInputStream(s);
		int ch;
		while((ch=bin.read())!=-1)
		{
			System.out.println(ch);
		}
	}

}
