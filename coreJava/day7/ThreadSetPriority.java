package com.day7;

class ThreadM extends Thread {
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

class ThreadN extends Thread {
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
class ThreadO extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread C");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}

}

public class ThreadSetPriority {

	public static void main(String[] args) {

		ThreadM th1 = new ThreadM();
		ThreadN th2 = new ThreadN();
		ThreadO th3 = new ThreadO();
//		System.out.println(th1.getPriority());
//		System.out.println(th2.getPriority());
//		
		
//		BAC is my pattern
		th3.setPriority(4);
		th2.setPriority(10);
		th1.setPriority(5);
		
		th1.start();
		th2.start();
		th3.start();

	}

}
