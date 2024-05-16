package com.day7;

class ThreadA extends Thread{
	public void run() {
		for(int i = 0; i < 20; i++) {
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

class ThreadB extends Thread{
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println("Thread B");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class ThreadC extends Thread{
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println("Thread C");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String args[]) {
		ThreadA th1 = new ThreadA();
		ThreadB th2 = new ThreadB();
		ThreadC th3 = new ThreadC();
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		
		th3.setPriority(10);
		System.out.println(th3.getPriority());
		th1.start();
		th2.start();
		th3.start();
	}

}
