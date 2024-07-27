package mypackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileDemo2 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file1 = new FileInputStream("E:\\new.txt");
		int ch;
		while((ch=file1.read())!=-1)
		{
			System.out.print((char)ch);
		}
	}
	

}
