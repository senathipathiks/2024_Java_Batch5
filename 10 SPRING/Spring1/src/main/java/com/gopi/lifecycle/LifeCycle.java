package com.gopi.lifecycle;

public class LifeCycle {
	
	
	public LifeCycle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	public void init() {
		System.out.println("Initilization");
	}
	public void destroy(){
		System.out.println("Destroy method");
		}
}
