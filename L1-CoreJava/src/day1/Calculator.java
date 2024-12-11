
import java.util.*;

class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
