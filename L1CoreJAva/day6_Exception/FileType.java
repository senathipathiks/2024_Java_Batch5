package com.day6_Exception;

class ValType extends Exception{
	ValType(String n){
		super(n);
	}
}

class FileCommision {
	FileCommision(String input) throws ValType {
		boolean isValidFormat = input.matches("^.*\\.(jpg|JPG|gif|GIF|doc|DOC|pdf|PDF|txt|TXT)$");
		if (!isValidFormat) {
			throw new ValType("Invalid Filetype ");
		} else
			System.out.println("Valid FileType");
	}
}
 
public class FileType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileCommision F = new FileCommision("Main.jpg");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}

