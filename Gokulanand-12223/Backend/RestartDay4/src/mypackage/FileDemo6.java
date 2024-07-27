package mypackage;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo6
{
	public static void main(String[] args) throws IOException
	{
		FileReader file1 = new FileReader("E:\\new.txt");
		FileWriter file2 = new FileWriter("E:\\new1.txt");
		int ch;
		while((ch=file1.read())!=-1)
		{
			System.out.print((char)ch);
		}
	}
	

}
