package MultiThreading;

class ThreadA extends Thread {
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Thread A");
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Thread B");
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
		}
	}
}
class ThreadC extends Thread {
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Thread C");
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
		}
	}
}

public class ThreadWay1 {

	public static void main(String[] args) {
		
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();
		a.start();
		b.start();
		c.start();
		//setpriority
		a.setPriority(10);
		b.setPriority(4);
		c.setPriority(1);
		
		

	}

}
