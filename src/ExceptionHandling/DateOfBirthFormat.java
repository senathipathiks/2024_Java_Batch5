package ExceptionHandling;
import java.util.*;


class InvalidDOB extends Exception{
	InvalidDOB(String str){
		super(str);
	}
}

public class DateOfBirthFormat {

	static void validate(String s)throws InvalidDOB{
		String m[]= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		int flag=0;
		int monthflag=1;
		int yearflag=1;
		
		if(s.length()>=8) {
			String s1[]= s.split("-");
		
		int date=Integer.parseInt(s1[0]);
		String month= s1[1];
		int year=Integer.parseInt(s1[2]);
		
		if(date>=31) {
			flag=1;
		}
    for(int i=0;i<m.length;i++) {
    	if(m[i].equalsIgnoreCase(month)) {
    		monthflag=0;
    	}
    }
    if(year<=2024) {
    	yearflag=0;
    }
		}else {
    	flag=1;
    }
    if(flag==1||monthflag==1||yearflag==1) {
    	throw new InvalidDOB("Date of birth must be in the format of dd-mm-yyyy");
    }else {
    	System.out.println("Correct Format");
    }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter DOB:");
		String s=sc.next();
		
		try {
			validate(s);
		}catch(InvalidDOB e) {
			System.out.println(e);
		}
	}

}
