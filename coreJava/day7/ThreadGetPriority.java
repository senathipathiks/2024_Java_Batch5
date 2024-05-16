package com.day7;

class ThreadX extends Thread {
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

class ThreadY extends Thread {
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

public class ThreadGetPriority {

	public static void main(String[] args) {

		ThreadX th1 = new ThreadX();
		ThreadY th2 = new ThreadY();
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		
		th2.start();
		th1.start();

	}

}
