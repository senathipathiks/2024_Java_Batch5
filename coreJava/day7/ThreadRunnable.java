package com.day7;


class Thread10 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread A");
		}
		
		
	}
	
}

class Thread20 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread B");
		}
		
		
	}
	
}
public class ThreadRunnable {

	public static void main(String[] args) {
		
		Thread10 th1 =new Thread10();
		Thread20 th2 =new Thread20();
		Thread obj1 =new Thread(th1);
		Thread obj2 =new Thread(th2);
		obj2.start();
		obj1.start();
		
		
	}

}
