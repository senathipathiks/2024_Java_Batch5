package com.day6;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a=20,b=0;
		try // statement causing exception should be bundled in try block
		{
			
			int res=a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("exception handled succesfully");
	}

}

// without exception |
					

//
//public class ExceptionDemo {
//
//	public static void main(String[] args) {
//		
//		int a=20,b=0;
//		
//			
//			int res=a/b;
//		
//		System.out.println("exception handled succesfully");
//	}
//
//}