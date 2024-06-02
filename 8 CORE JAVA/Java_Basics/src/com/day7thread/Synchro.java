package com.day7thread;

class File1{
	synchronized public void sum(int[] arr) {
		int res = 0;
		for(int i:arr) {
			res+=i;
			System.out.println("Input values is: "+i+" The corrent sum value is: "+res);
		}
		System.out.println("The Total value of the one thread is: "+res);
	}
}

class ThreadA1 extends Thread{
	File1 f = new File1();
	int arr[]={1,2,3,4,5};
	ThreadA1(File1 f){
		this.f = f;
	}
	public void run() {
		f.sum(arr);
	}
}

class ThreadB1 extends Thread{
	File1 f = new File1();
	int arr[]={6,7,8,9,10};
	ThreadB1(File1 f){
		this.f = f;
	}
	public void run() {
		f.sum(arr);
	}
}

public class Synchro {

	public static void main(String[] args) {
		File1 f1 =new File1();
		ThreadA1 obj1 = new ThreadA1(f1);
		ThreadB1 obj2 = new ThreadB1(f1);
		
		obj1.start();
		obj2.start();

	}

}
