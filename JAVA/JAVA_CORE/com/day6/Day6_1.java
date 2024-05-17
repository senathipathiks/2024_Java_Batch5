package com.day6;
//min priority=1,max=10
//normal=5
class ThreadA extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Thread A");		}
	}
}
class ThreadB extends Thread
{
	//thread scheduler will decide which to execute first
	//if both the process have the same priority then it follows FIFO or else preemptive scheduling will come into act
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Thread b");		}
	}
}
public class Day6_1 {

	public static void main(String[] args) {
		ThreadA th1=new ThreadA();
		ThreadB th2= new ThreadB();
		th1.start();
		th2.start();

	}

}
