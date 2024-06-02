package com.day6;

import java.util.Scanner;

class InvalidFileException extends Exception  
{  
    public InvalidFileException(String str)  
    {  
        super(str);  
    }
}

class TestFileException  
{  
  
    static void validate (String file) throws InvalidFileException{
       if(file.equals("png")||file.equals("docx")||file.equals("pdf")||file.equals("doc")) {
      	   System.out.println("The File Format is Correct");
       }  
       else {
    	   throw new InvalidFileException("File Format is not valid");
       }
    }
}

public class FileType {

	public static void main(String[] args) {
		System.out.println("File:");
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
		TestFileException obj1 = new TestFileException();
		String[] arrOfStr = file.split("\\.", 2);
		try {
			obj1.validate(arrOfStr[1]);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
