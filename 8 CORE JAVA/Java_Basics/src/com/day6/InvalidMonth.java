package com.day6;

import java.util.Scanner;

class InvalidMonthException extends Exception  
{  
    public InvalidMonthException(String str)  
    {  
        super(str);  
    }
}  

class TestMonthException  
{
  
    static void validate (int month) throws InvalidMonthException{   
       if(month > 12){ 
  
        throw new InvalidMonthException("Month is not valid");    
       }  
       else {
    	switch(month) {
    	case 1:
    		System.out.println("Jan");
    		break;
    	case 2:
    		System.out.println("Feb");
    		break;
    	case 3:
    		System.out.println("Mar");
    		break;
    	case 4:
    		System.out.println("Apr");
    		break;
    	case 5:
    		System.out.println("May");
    		break;
    	case 6:
    		System.out.println("Jun");
    		break;
    	case 7:
    		System.out.println("Jul");
    		break;
    	case 8:
    		System.out.println("Aug");
    		break;
    	case 9:
    		System.out.println("Sep");
    		break;
    	case 10:
    		System.out.println("Oct");
    		break;
    	case 11:
    		System.out.println("Nov");
    		break;
    	case 12:
    		System.out.println("Dec");
    		break;
        }
     }
   }
}

public class InvalidMonth {

	public static void main(String[] args) {
		TestMonthException obj1 = new TestMonthException();
		System.out.println("Enter the Month Number");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		try  
        {   
            obj1.validate(month);  
            
        }  

        catch (InvalidMonthException ex)  
        {  
            System.out.println("Caught the exception");  
    
            System.out.println("Exception occured: " + ex);  
        }
		finally {
			System.out.println("hello");
		}
		System.out.println("gopi");

    }  
}

 