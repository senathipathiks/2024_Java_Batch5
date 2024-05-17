package com.day6;
class File1
{
	synchronized public void sum(int[] arr)
	{
		int res=0;
		for(int i:arr)
		{
			res+=i;
			System.out.println("Value of i:"+i);
		}
		System.out.println("sum is:"+res);
	}
}
class ThreadF extends Thread
{
	File1 f = new File1();
	int arr[]= {10,28,11,24,15};
	ThreadF(File1 f)
	{
		this.f=f;
	}
	public void run()
	{
		f.sum(arr);
	}
}
class ThreadG extends Thread
{
	File1 f = new File1();
	int arr[]= {1,2,3,4,5};
	ThreadG(File1 f)
	{
		this.f=f;
	}
	public void run()
	{
		f.sum(arr);
	}
}
public class Day6_6 {
	public static void main(String args[])
	{
		File1 f1=new File1();
		ThreadF th1=new ThreadF(f1);
		ThreadG th2=new ThreadG(f1);
		th1.start();
		th2.start();
		System.out.println(th1.getPriority());
	}

}
