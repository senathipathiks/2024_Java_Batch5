package com.day6_Exception;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


class Month extends Exception{
	Month(String n){
		super(n);
	}
}

class ValMonth{
	ValMonth(int num) throws Month{
		if(num>12) {
			throw new Month("Invalid Month");
		}
		else {
			System.out.println("Valid Month");
		}
	}
}
public class InvalidMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ValMonth V = new ValMonth(5);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
