package com.raj.beanlifecycle;

public class BeanLifeCycle {
	
	public BeanLifeCycle() {
		System.out.print("Constructor Method!");
	}
	public void init() {
		System.out.print("Init Method call!");
	}
	public void destroy() {
		System.out.print("Destroy Method Call!");
	}
	
	
}
