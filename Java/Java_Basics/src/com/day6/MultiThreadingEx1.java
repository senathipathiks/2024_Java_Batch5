package com.day6;

class Thread1 extends Thread{
	public void run() {
		for(int i = 0 ; i <10 ; i++) {
			System.out.println("Thread A");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 implements Runnable{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Thread B");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread3 implements Runnable{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Thread C");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingEx1 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		Thread obj3 = new Thread(t3);
		
		obj1.setPriority(10);
		obj2.setPriority(7);
		obj3.setPriority(4);
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
