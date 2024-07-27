package mypackage;
import java.io.IOException;
public class FileDemo 
{
	public static void main(String[] args) throws IOException
	{
		char c;
		c = (char)System.in.read();
		System.out.println(c);
		System.out.println("This is the output");
		System.err.print("This is an error statement");
	}

}
