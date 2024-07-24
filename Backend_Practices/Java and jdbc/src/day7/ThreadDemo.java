package day7;


class Thread1 extends Thread{
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println("Thread A = "+(i+1));
			System.out.println("----------------------");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println("Thread B = "+(i+1));
			System.out.println("----------------------");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class Thread3 implements Runnable{
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println("Thread C = "+(i+1));
			System.out.println("----------------------");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
 
 
public class ThreadDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 a = new Thread1();
		Thread2 b = new Thread2();
		Thread c = new Thread(new Thread3());
		System.out.println(a.getPriority());
//		a.setPriority(ThreadA.MAX_PRIORITY);
//		c.setPriority(ThreadC.MIN_PRIORITY);
		a.setPriority(10);
		c.setPriority(3);
		System.out.println(a.getPriority());
		c.start();
		b.start();
		a.start();
	}
}
 
