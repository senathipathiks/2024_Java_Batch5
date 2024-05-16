package com.day7;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread A");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}

	}

}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread B");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}

}

public class ThreadSleep {

	public static void main(String[] args) {

		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th2.start();
		th1.start();

	}

}
