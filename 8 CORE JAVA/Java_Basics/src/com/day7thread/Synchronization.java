package com.day7thread;

class File{
	synchronized public void print() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}

class ThreadA extends Thread{
	File f = new File();
	ThreadA(File f){
		this.f = f;
	}
	public void run() {
		f.print();
	}
}

class ThreadB extends Thread{
	File f = new File();
	ThreadB(File f){
		this.f = f;
	}
	public void run() {
		f.print();
	}
}

public class Synchronization {
	public static void main(String args[]) {
		File f1 =new File();
		ThreadA obj1 = new ThreadA(f1);
		ThreadB obj2 = new ThreadB(f1);
		
		obj1.start();
		obj2.start();
	}
}
