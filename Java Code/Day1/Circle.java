//package com.day1;

public class Circle {

	public static void main(String[] args) {
//		     double r = Double.parseDouble(args[0]);
//		     double area = 3.14 * r *r;
//		     double peri = 3.14 * 2*r;
//		     System.out.println("Area of cricle is : "+area);
//		     System.out.println("Perimeter of circle is : "+peri);
		
		  String ops = args[0];
	       int a  = Integer.parseInt(args[1]);
	       int b   = Integer.parseInt(args[2]);
	       String ch =ops;
	       switch (ch) {
		    case "ADD": {
				System.out.println("Sum of a and b is "+(a+b));
				break;
		    }
		    case "SUB": {
				System.out.println("Difference of a and b is "+(a-b));
				break;
		    }
		   case "MUL": {
				System.out.println("Product  of a and b is "+(a*b));
				break;
		    }
		    case "DIV": {
			System.out.println("Quotint of a and b is "+(a/b));
			break;
		}
		}
	}
}
