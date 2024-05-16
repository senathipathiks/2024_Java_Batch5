package com.day3;

class a{
	a(){
		System.out.println("class A");
	}
}

class b extends a{
	b(){
		System.out.println("class B");
	}
}

class c extends b{
	c(){
		System.out.println("Class C");
	}
	c(int x){
		System.out.println("Class C-1");
	}
}

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c c1 = new c(5);

	}

}
