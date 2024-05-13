package com.day6;

import java.util.Scanner;

class InvalidMonthException extends Exception{
	public InvalidMonthException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}

class MonthCheck{
	public MonthCheck(int mon) throws InvalidMonthException {
		// TODO Auto-generated constructor stub
		if(mon < 1 || mon > 12) {
			throw new InvalidMonthException("Enter Valid Month");
		}
		else {
			String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
			System.out.println(month[mon-1] + " Month");
		}
	}
}

public class MonthException {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Month in terms of number");
		int n = in.nextInt();
		
		try {
			MonthCheck obj = new MonthCheck(n);
		}
		catch(InvalidMonthException e){
			System.out.println(e);
		}
	}
}
