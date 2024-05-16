package com.day7;

class ThreadA1 implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Thread A");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}

class ThreadB1 implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Thread B");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		ThreadA1 th1 = new ThreadA1();
		Thread t1 = new Thread(th1);
		ThreadB1 th2 = new ThreadB1();
		Thread t2 = new Thread(th2);
		System.out.println(t1.getPriority());
		t1.start();
		t2.start();

	}

}
