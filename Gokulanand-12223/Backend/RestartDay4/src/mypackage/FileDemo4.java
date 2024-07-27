package mypackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file1 = new FileInputStream("E:\\Screenshot 2024-04-01 174719.png");
		FileOutputStream file2 = new FileOutputStream("E:\\Screenshot 2024-04-01 1747191.png");
		
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
