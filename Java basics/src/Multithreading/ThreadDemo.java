package Multithreading;

class ThreadA extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread A");
		}
	}
}

class ThreadB extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread B");
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA th1=new ThreadA();
		ThreadB th2=new  ThreadB();
		th1.run();
		th2.run();
		

	}

}