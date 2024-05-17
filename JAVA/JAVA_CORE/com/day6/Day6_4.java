package com.day6;
class Thread111 implements Runnable
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
class Thread222 implements Runnable
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
class Thread333 implements Runnable
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
public class Day6_4 {

	public static void main(String[] args) {
		Thread111 th1=new Thread111();
		Thread222 th2= new Thread222();
		Thread333 th3=new Thread333();
		Thread ob1=new Thread(th1);
		Thread ob2=new Thread(th2);
		Thread ob3=new Thread(th3);
		ob1.start();
		ob2.start();
		ob3.start();

	}

}
