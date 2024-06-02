package com.day10;

interface VehiclePlan{
	void a(); // they are already public & Abstract
	public abstract void b();
	void c();
}

abstract class abs implements VehiclePlan{
	void ab() {
		System.out.println("method ab from abs");
	}
	
}

public class Inter extends abs {

	public void a() {
		System.out.println("method a from inter");
	}
	public void b() {
		System.out.println("method b from inter");
	}
	public void c() {
		System.out.println("method c from inter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inter vc = new Inter();
		vc.a();
		vc.b();
		vc.c();
		vc.ab();

	}

}
