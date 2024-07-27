package com.day2.BeanLifeCycle;

public class BeanLifeCycle {

	public BeanLifeCycle() {
		System.out.println("Constructor method");
	}

	public void init() {
		System.out.println("Initialization method");
	}
	
	public void destory() {
		System.out.println("Destory method");
	}
}
