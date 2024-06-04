package com.day7;


class A{
	String msg = getMessage();
	String getMessage() {
		return "A";
	}
}

class B extends A{
	String getMessage() {
		return "B";
	}
}
public class DMDEx2 {

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.msg);

	}

}
