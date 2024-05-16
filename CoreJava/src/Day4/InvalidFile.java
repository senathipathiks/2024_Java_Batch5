package Day4;

import java.util.Scanner;

class InvalidFileException extends Exception
{
	InvalidFileException(String msg)
	{
		super(msg);
	}
}

class CheckFile
{
	CheckFile(String file)throws InvalidFileException
	{
		String fileformat="(\"^.*\\\\.(jpg|JPG|gif|GIF|doc|DOC|pdf|PDF|txt)$\");";
		if(file.matches(fileformat))
		{
			System.out.println("File Name :"+file);
		}
		
		else {
			throw new InvalidFileException("Invalid File Format");
		}
			
	}
	
}

public class InvalidFile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String file=sc.next();
		try {
			CheckFile cm=new CheckFile(file);
		}
		catch(Exception e) {
			System.out.println(e);
		}  
	}

}
