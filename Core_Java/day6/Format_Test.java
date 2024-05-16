package com.day6;
 
class InvalidFormat extends Exception{
	InvalidFormat(String str){
		super(str);
	}
}
 
class Format{
	Format(String date) throws InvalidFormat{
		boolean res = date.matches("([1-9]{1}|[0]{1}[1-9]{1}|[1]{1}[0-9]{1}|[2]{1}[0-9]{1}|[3]{1}[0-1]{1})" +
		           "([-]{1})" +
		           "([0]{1}[1-9]{1}|[1]{1}[0-2]{1}|[1-9]{1})" +
		           "([-]{1})" +
		           "([20]{2}[0-9]{2})");
		if(!res) {
			throw new InvalidFormat("invalid Format");
		}
		else {
			System.out.println("valid Format");
		}
	}
}
public class Format_Test {
 
	public static void main(String[] args) {
		try {
		Format f = new Format("22-07-2002");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handled successfully");
		}
		
 
	}
 
}