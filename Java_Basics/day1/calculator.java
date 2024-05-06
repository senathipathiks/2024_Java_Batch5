//package day1;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer a= Integer.parseInt(args[0]);
		Integer b= Integer.parseInt(args[1]);
		String str = args[2];
		if(str.equals("+"))
		{
			int result = a+b;
			System.out.println(result);
		}
		else if(str.equals("-"))
		{
			int result = a-b;
			System.out.println(result);
		}
		else if(str.equals("/"))
		{
			int result = a/b;
			System.out.println(result);
		}

		else
		{
			int result = a * b;
			System.out.println(result);
			
		}

	}

}
