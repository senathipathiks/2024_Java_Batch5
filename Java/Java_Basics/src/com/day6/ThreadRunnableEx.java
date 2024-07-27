package com.day6;

class Thread1 implements Runnable{
	public void run() {
		for(int i = 0 ; i <10 ; i++) {
			System.out.println("Thread A");
			try {
				Thread.sleep(1000);
				System.out.println("---------");
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{
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

class Thread3 extends Thread{
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

public class ThreadRunnableEx {

	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		Thread t3 = new Thread3();
		
		t2.setPriority(4);
		t3.setPriority(10);
		t1.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
