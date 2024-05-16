package com.day7;

class File{
	synchronized public void print() { //if not mentioned method as a synchronized means both thread run randomly based on the quantum time or elapsed time.
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class ThreadsA extends Thread{
	File f = new File();
	ThreadsA(File f){
		this.f = f;
	}
	public void run() {
		f.print();
	}
}

class ThreadsB extends Thread{
	File f = new File();
	ThreadsB(File f){
		this.f = f;
	}
	public void run() {
		f.print();
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		File f1 = new File();
		ThreadsA th1 = new ThreadsA(f1);
		ThreadsB th2 = new ThreadsB(f1);
		th1.start();
		th2.start();
		

	}

}
