package com.day10;

interface a1{
	void ab();

}
interface a2 extends a1{
	void ac();

}
interface a3 extends a2{
	void bc();

}

public class NImpliment implements a3{

	public void ab(){
		System.out.println("ab is Running");
	}
	public void ac(){
		System.out.println("ac is Running");
	}
	public void bc(){
		System.out.println("bc is Running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a3 ni = new NImpliment();
		ni.ab();
		ni.ac();
		ni.bc();
	}

}
