package com.day10;

interface One {
	int a = 10; // public ,static , final;
	int b = 20;
}

interface Two {
	int b = 10;
	int a = 20;
}

interface Three extends One,Two {
	void add();
}

abstract class Four implements Three {
	
}

class addi extends Four{
	public void add() {
		System.out.println(One.a + Two.a);
	}
}

public class MultiInher {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addi mi = new addi();
		mi.add();
	}

}
