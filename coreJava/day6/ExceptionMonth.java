package com.day6;



class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

class Month{
	
	Month(int month) throws InvalidMonthException{
		
		if (month<1|| month<13) {
			
			System.out.println("valid month");
		}
		else {
			
			System.out.println("Ivalid month ");
		}
	}
}
public class ExceptionMonth{
	
    public static void main(String[] args) {
       
    	try {
    		
    		Month obj = new Month(16);
    		
    	}
    	catch(Exception e) {
    		
    		System.out.println(e);
    	}
  
    }
}
