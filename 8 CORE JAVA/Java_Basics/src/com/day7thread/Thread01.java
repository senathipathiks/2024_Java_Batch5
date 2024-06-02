package com.day7thread;

class A extends Thread{
	public A(String name) {
        super(name);
    }
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
			try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			
		}
	}
}
//
//class B extends Thread{
//	public void run() {
//		for(int i=0;i<20;i++) {
//			System.out.println("The thread B is running");
//		}
//	}
//}
//
//class C extends Thread{
//	public void run() {
//		for(int i=0;i<20;i++) {
//			System.out.println("The thread C is running");
//			
//		}
//	}
//}

public class Thread01 {

	public static void main(String[] args) {
		A a1 =new A("Thread 1");
		A a2 =new A("Thread 2");

		a2.setPriority(A.MAX_PRIORITY);
		a1.setPriority(A.MIN_PRIORITY);
		
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		

		
		a1.start();
		a2.start();
		
		

	}

}
