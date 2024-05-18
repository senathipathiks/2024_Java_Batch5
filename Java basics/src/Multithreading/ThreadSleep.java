package Multithreading;

class Threadc extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread A");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Threadd extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread B");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Threade extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Thread C");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadc th1=new Threadc();
		Threadd th2=new  Threadd();
		Threade th3=new Threade();
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
		th3.setPriority(10);
		th2.setPriority(6);
		th1.setPriority(2);
		th1.run();
		th2.run();
		th3.run();
		
	}

}
