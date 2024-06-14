package MultiThreading;


class Threads extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread AA");
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
	}
}
class ThreadA extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread BB");
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
	}
}
class ThreadC extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread CC");
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
	}
}

public class Sample {

	public static void main(String s[]) {
		// TODO Auto-generated method stub
Threads t1=new Threads();
ThreadA t2=new ThreadA();
ThreadC t3=new ThreadC();
//System.out.println(t1.getPriority());
//System.out.println(t2.getPriority());
//System.out.println(t3.getPriority());
t3.setPriority(10);
t2.setPriority(3);
t1.start();
t2.start();
t3.start();

	}

}
