package com.day7;

class Sync{
	synchronized public void sum() {
		int ans = 0;
		for(int i=0; i<5; i++) {
			ans += i;
			System.out.println("i = "+ i + " Ans = "+ans);
		}
		System.out.println(ans);
	}
}

class ThreadOne extends Thread{
	Sync obj;
	public ThreadOne(Sync obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	public void run() {
		obj.sum();
	}
}

class ThreadTwo extends Thread{
	Sync obj;
	public ThreadTwo(Sync obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	public void run() {
		obj.sum();
	}
}

public class ThreadSync {
	public static void main(String[] args) {
		Sync obj = new Sync();
		ThreadOne t1 = new ThreadOne(obj);
		ThreadTwo t2 = new ThreadTwo(obj);
		
		t1.start();
		t2.start();
	}
}
