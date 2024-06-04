 package com.day5;

class File
{
	public void print()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
}

class ThreadC extends Thread{
	File f = new File();
	ThreadC(File f){
		this.f = f;
	}
	public void run() {
		f.print();
	}
}


class ThreadD extends Thread{
	File f = new File();
	ThreadD(File f){
		this.f = f;
	}
	public void run() {
		f.print();
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File();
		ThreadC th1 = new ThreadC(f1);
		ThreadD th2 = new ThreadD(f1);
		
		th1.start();
		th2.start();

	}

}
