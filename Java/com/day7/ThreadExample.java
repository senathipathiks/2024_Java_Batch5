package com.day7;

class ThreadA extends Thread{
	public void print() {
		for(int i=0; i<10; i++) {
			System.out.println("A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadB extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("B");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class ThreadC extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("C");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		t1.setPriority(10);
		t2.setPriority(7);
		t3.setPriority(8);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
	}
}
