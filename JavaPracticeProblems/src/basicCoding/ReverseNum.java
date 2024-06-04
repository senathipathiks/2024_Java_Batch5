package basicCoding;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to reverse : ");
		
		String s = sc.next();
		String res = "";
		for(int i=s.length()-1 ;i>=0;i--) {
			res = res + s.charAt(i);
		}
		System.out.print(res);
	}

}
