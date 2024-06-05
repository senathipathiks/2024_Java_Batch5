package Streams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndFileWriter {

	public static void main(String[] args) throws IOException {
		
			
		FileReader fre = new FileReader("D:\\PORIE.txt");
		int ch;
		while((ch=fre.read())!=-1) {
			System.out.print((char)ch);
		}
	}

}
