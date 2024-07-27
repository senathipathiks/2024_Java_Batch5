package com.day5;

import java.util.Scanner;

class InvalidFileTypeException extends Throwable{
	InvalidFileTypeException(String msg){
		super(msg);
	}
}

class FileCheck{
	FileCheck(String name) throws InvalidFileTypeException {
		String splitted[] = name.split("[.]",0);
		String type = splitted[1];
		
		if(type.equalsIgnoreCase("pdf") || type.equalsIgnoreCase("png") || type.equalsIgnoreCase("docx") || type.equalsIgnoreCase("jpg") || type.equalsIgnoreCase("jpeg")) {
			System.out.println("Valid file format. Your file has been accepted!!!");
		}
		else {
			throw new InvalidFileTypeException("Invalid File Type");
		}
	}
}

public class InvalidFileTypeTask {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Enter a file name with extension:");
			FileCheck fc = new FileCheck(sc.next());
		}
		catch(InvalidFileTypeException e) {
			System.out.println("Error: "+e);
		}

	}

}
