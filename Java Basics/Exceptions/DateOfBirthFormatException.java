package Exceptions;

import java.util.Scanner;

class InvalidDOBException extends Exception{
	InvalidDOBException(String str){
		super(str);
	}
}
public class DateOfBirthFormatException {

	static void validate(String s) throws InvalidDOBException{
		String m[] = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		int flag = 0;
		int monthflag = 1;
		int yearflag = 1;
		
		if(s.length()>=8) {
			String s1[] = s.split("-");
			
			int date = Integer.parseInt(s1[0]);
			String month = s1[1];
			int year = Integer.parseInt(s1[2]);
			
			if(date >= 31) {
				flag =1;
			}
			for(int i=0;i<m.length;i++) {
				if(m[i].equalsIgnoreCase(month)) {
					monthflag = 0;
				}
			}
			if(year <= 2024) {
				yearflag =0;
			}
			
		}
		else {
			flag =1;
		}
		if(flag == 1 || monthflag ==1 || yearflag == 1) {
			throw new InvalidDOBException("Date of birth format must be in Date-Month-Year Example 00-00-0000");
		} else {
			System.out.println("Correct format");
		}
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date of birth");
		String s = sc.nextLine();
		try {
			
		   validate(s);
		}
		catch(InvalidDOBException e) {
			System.out.println(e);
		}

	}

}
