package FileInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fin = new FileInputStream("D:\\gta.jpg"); 
		FileOutputStream fout = new FileOutputStream("D:\\saveas.jpg"); 
		int ch;
		while((ch=fin.read())!=-1)
		{
			fout.write((char)ch);
		}
		
		System.out.println("Task completed");
		fin.close();
		fout.close();
	}

}
