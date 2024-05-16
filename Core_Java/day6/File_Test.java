package com.day6;

class InvalidFile extends Exception{
	InvalidFile(String str){
		super(str);
	}
}

class File{
	File(String data)throws InvalidFile{
		boolean str = data.matches("(?i:^.*\\.(jpg|jpeg|png|gif|pdf|doc)$)");
		if(!str) {
			throw new InvalidFile("Invalid file Format");
		}
		else {
			System.out.println("Valid file format");
		}
	}
}
public class File_Test {

	public static void main(String[] args) {
		try {
			File f = new File("file.pg");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handled successfully");
		}

	}

}
