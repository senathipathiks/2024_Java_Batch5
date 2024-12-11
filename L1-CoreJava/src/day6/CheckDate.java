package day6;

import java.util.Scanner;

class InvalidMonthException extends Exception{
	public InvalidMonthException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
//class InvalidFormatException extends Exception{
//	public InvalidFormatException() {
//		// TODO Auto-generated constructor stub
//	}
//}
public class CheckDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       System.out.println("Enter DD-MM-YYYY : ");
       try {
       String date = s.next();
       
       if(Integer.parseInt(date.substring(3, 5))  >=1 && Integer.parseInt(date.substring(3, 5))<=12 ) {
    	 System.out.println("Valid Date ");  
       }
       else {
		throw new InvalidMonthException("Invalid Month Range");
	     }
       
      
       }
       catch (Exception e) {
		// TODO: handle exception
    	   System.err.println(e);
	}
       
 	}

}
