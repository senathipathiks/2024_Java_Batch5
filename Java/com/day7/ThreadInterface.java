package com.day7;

class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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

class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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

public class ThreadInterface {
	public static void main(String[] args) {
		
		Thread1 o1 = new Thread1();
		Thread2 o2 = new Thread2();
		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(o2);
		
		t1.start();
		t2.start();
		
	}
}
