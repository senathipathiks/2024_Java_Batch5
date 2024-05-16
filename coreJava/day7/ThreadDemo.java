package com.day7;


class ThreadA extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread A");
		}
		
		
	}
	
}

class ThreadB extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread B");
		}
		
		
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		ThreadA th1 =new ThreadA();
		ThreadB th2 =new ThreadB();
		th2.start();
		th1.start();
		
		
	}

}
