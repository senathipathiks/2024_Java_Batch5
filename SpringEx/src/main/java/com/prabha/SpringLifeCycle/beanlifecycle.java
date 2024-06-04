package com.prabha.SpringLifeCycle;

public class beanlifecycle {
	public beanlifecycle() {
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
