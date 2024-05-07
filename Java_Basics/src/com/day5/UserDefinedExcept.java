package com.day5;
import java.io.*;
import java.util.*;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}

class ElectionCommission{
	ElectionCommission(int age) throws InvalidAgeException{
		if(age < 18 || age > 110) {
			System.out.println("Invalid Age");
		}
		else {
			System.out.println("Welcome to Election Commission!!!");
		}
	}
}


public class UserDefinedExcept {

	public static void main(String[] args) {
		try {
			ElectionCommission obj1;
		}
	}
}
