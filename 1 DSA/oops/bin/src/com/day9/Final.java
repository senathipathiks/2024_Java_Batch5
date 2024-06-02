package com.day9;


final class a {
	// can't overloading
}

class b  {
	void Two1(int r) {
		System.out.println("B");
	}
	
}

public class Final extends b{
	void Two1(int q){
		System.out.println("B 1");
	}

	public static void main(String[] args) {
		final int a=10;
		Final cn = new Final();
		cn.Two1(a);
		
	}
}
