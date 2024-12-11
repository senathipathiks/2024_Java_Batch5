package day6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class InvalidMonthFormatException extends Exception{
	public InvalidMonthFormatException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class Date_Month_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner  s = new Scanner(System.in);
     System.out.println("Enter Date in Format : DD-MMM-YYYY");
    ArrayList<String> montharr = new ArrayList<String>(Arrays.asList("JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"));
     try {
		String  date = s.next();
		String mon = date.substring(3, 6);
		if(date.length()==11 &&  montharr.contains(mon) ) {
			System.out.println("Valid Format");
		}
		else {
			throw new InvalidMonthFormatException("Invalid Month Format");
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println(e);
	}
	}

}
