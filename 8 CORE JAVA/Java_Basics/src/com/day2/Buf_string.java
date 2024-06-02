package com.day2;

public class Buf_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Gopi");// Or we can use StringBuilder
		System.out.println(str);

		System.out.println(str.append("krishnan,chennai"));
		System.out.println(str);
		System.out.println(str.reverse());
		System.out.println(str);

		System.out.println(str.reverse());
		System.out.println(str);

		System.out.println(str.replace(0,1,"g"));


	}

}
