package Multithreading;

class ThreadEg1 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread A");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ThreadEg2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread B");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		ThreadEg1 th1=new ThreadEg1();
		ThreadEg2 th2=new ThreadEg2();	
		Thread obj=new Thread(th1);
		Thread obj1=new Thread(th2);
		obj.start();
		obj1.start();
		
		}

}

