package com.day6_Exception;

class Valid extends Exception{
	Valid(String n){
		super(n);
	}
}

class Val{
	Val(String str) throws Valid{
		boolean isValidFormat = str.matches("([1-9]{1}|[0]{1}[1-9]{1}|[1]{1}[0-9]{1}|[2]{1}[0-9]{1}|[3]{1}[0-1]{1})" +
		           "([/]{1})" +
		           "([0]{1}[1-9]{1}|[1]{1}[0-2]{1}|[1-9]{1})" +
		           "([/]{1})" +
		           "([20]{2}[0-9]{2})");
		if(!isValidFormat) {
			throw new Valid("invalid Format");
		}
		else {
			System.out.println("valid Format");
		}
	}
}
public class InvalidFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Val v = new Val("22/07/2002");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
