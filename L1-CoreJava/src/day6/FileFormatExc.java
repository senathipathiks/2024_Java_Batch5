package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class InvalidFileFormatException extends Exception{
	
	public InvalidFileFormatException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class FileFormatExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    String filename = s.next();
    String arr[] = filename.split("[.]",0);
    String format = arr[arr.length-1];
    
    ArrayList<String> files = new  ArrayList<String>(Arrays.asList("jpg","pdf","doc","jpeg","docx","txt"));
    try {
    	if(files.contains(format)) {
    		System.out.println("Valid Format");
    	}
    	else {
			throw new InvalidFileFormatException("Invalid File Format");
		}
    }
    catch (Exception e) {
		// TODO: handle exception
    	System.out.println(e);
	}
	}

}
