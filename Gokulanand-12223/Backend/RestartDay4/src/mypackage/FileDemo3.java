package mypackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileDemo3
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file1 = new FileInputStream("E:\\new.txt");
		FileOutputStream file2 = new FileOutputStream("E:\\new1.txt");
		
		int ch;
		while((ch=file1.read())!=-1)
		{
			file2.write((char)ch);
		}
		System.out.println("Task Completed...");
		file1.close();
		file2.close();
	}
}
