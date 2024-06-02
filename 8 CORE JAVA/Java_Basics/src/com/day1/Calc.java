package com.day1;

public class Calc {

	public static void main(String[] args) {
		switch (args[0]) {
			case "add":
				double add =Double.parseDouble( args[1])+Double.parseDouble(args[2]);
				System.out.println("Addition: "+add);
				break;
			case "sub":
				double sub =Double.parseDouble( args[1]) - Double.parseDouble(args[2]);
				System.out.println("Subtraction: "+sub);
				break;
			case "mul":
				double mul =Double.parseDouble( args[1]) * Double.parseDouble(args[2]);
				System.out.println("Multiplication: "+mul);
				break;
			case "div":
				double div =Double.parseDouble( args[1]) / Double.parseDouble(args[2]);
				System.out.println("Divition: "+div);
				break;
		}
	}

}
