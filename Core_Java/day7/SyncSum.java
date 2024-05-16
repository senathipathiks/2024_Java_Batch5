package com.day7;

class Files{
		synchronized public void sum(int[] arr) {
		int res = 0;
		for(int i : arr) {
			res += i;
			System.out.println("value of i is: "+i+" Sum is: "+res);
		}
		System.out.println(res);
	}
}

class Thread1 extends Thread{
	Files f = new Files();
	int arr[] = {1,2,3,4,5};
	Thread1(Files f){
		this.f = f;
	}
	public void run() {
		f.sum(arr);
	}
}

class Thread2 extends Thread{
	Files f = new Files();
	int arr[] = {6,7,8,9,10};
	Thread2(Files f){
		this.f = f;
	}
	public void run() {
		f.sum(arr);
	}
}
public class SyncSum {

	public static void main(String[] args) {
		Files f1 = new Files();
		Thread1 t1 = new Thread1(f1);
		Thread2 t2 = new Thread2(f1);
		t1.start();
		t2.start();
		

	}

}
