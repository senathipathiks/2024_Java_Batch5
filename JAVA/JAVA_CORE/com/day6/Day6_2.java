package com.day6;
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Thread A");	
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Thread2 extends Thread
{
	//thread scheduler will decide which to execute first
	//if both the process have the same priority then it follows FIFO or else preemptive scheduling will come into act
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Thread b");		
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Thread3 extends Thread
{
	//thread scheduler will decide which to execute first
	//if both the process have the same priority then it follows FIFO or else preemptive scheduling will come into act
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Thread c");		
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Day6_2 {

	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		Thread2 th2= new Thread2();
		Thread3 th3=new Thread3();
		th1.start();
		th2.start();
		th3.start();

	}

}
