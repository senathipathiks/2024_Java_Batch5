package com.day6;

class InvalidMonth extends Exception{
	InvalidMonth(String msg){
		super(msg);
	}
}

class Month{
	Month(int month)throws InvalidMonth{
		if(month > 12 || month<=0) {
			throw new InvalidMonth(month+" Not a valid month");
		}
		else {
			System.out.println(month+" is the valid month");
		}
	}
}
public class Month_Test {

	public static void main(String[] args) {
		try {
			Month m = new Month(13);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handled successfully");
		}

	}

}
