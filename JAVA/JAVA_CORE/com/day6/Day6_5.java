package com.day6;
class File
{
	synchronized public void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
class ThreadD extends Thread
{
	File f = new File();
	ThreadD(File f)
	{
		this.f=f;
	}
	public void run()
	{
		f.print();
	}
}
class ThreadE extends Thread
{
	File f = new File();
	ThreadE(File f)
	{
		this.f=f;
	}
	public void run()
	{
		f.print();
	}
}
public class Day6_5 {
	public static void main(String args[])
	{
		File f1=new File();
		ThreadD th1=new ThreadD(f1);
		ThreadE th2=new ThreadE(f1);
		th1.start();
		th2.start();
	}

}
