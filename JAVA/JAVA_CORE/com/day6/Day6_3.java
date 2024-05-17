package com.day6;
class Thread11 extends Thread
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
class Thread22 extends Thread
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
class Thread33 extends Thread
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
public class Day6_3 {

	public static void main(String[] args) {
		Thread11 th1=new Thread11();
		Thread22 th2= new Thread22();
		Thread33 th3=new Thread33();
		th1.setPriority(3);
		th2.setPriority(5);
		th3.setPriority(9);
		th1.start();
		th2.start();
		th3.start();

	}

}
