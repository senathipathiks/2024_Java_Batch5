package day9;

import java.io.IOException;

public class ReadInput {

	public static void main(String[] args) throws IOException{
		
		char c = (char)System.in.read();
		System.out.println(c);
		System.out.println("This is Output");
		System.err.println("This is Error");
	}

}
