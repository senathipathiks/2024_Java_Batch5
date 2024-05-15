package day6;

class InvalidAgeExeception extends Exception{
	
	InvalidAgeExeception(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	
	
	}
}

class ElectionCommision{
	ElectionCommision(int age)throws InvalidAgeExeception {
		// TODO Auto-generated constructor stub
		if (age<18 || age>110) {
			throw new InvalidAgeExeception("Invalid Age");
		}
		else {
			System.out.println("Welcome to Election Commission of India ");
		}
	}
}

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  
        	  ElectionCommision obj = new ElectionCommision(30);
        	  ElectionCommision obj1 = new ElectionCommision(13);
        	  
          }
          catch (Exception e) {
			// TODO: handle exception
        	  System.err.println(e);
		}
	}

}
