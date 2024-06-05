package com.vicky.lifeCycle;

public class BeanLifeCycle {

	public BeanLifeCycle() {
		System.out.println("Constructor method");
	}
	public  void init() {
		System.out.println("Initilization method");
	}
	public void destroy() {
		System.out.println("Destroy method");
	}
	
}
