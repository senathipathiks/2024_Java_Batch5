package MultiThreading;

class Thread1 implements Runnable {
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

class Thread2 implements Runnable {
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
class Thread3 implements Runnable {
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

public class ThradWay2 {

	public static void main(String[] args) {
		
		
		Thread1 a = new Thread1();
		Thread2 b = new Thread2();
		Thread3 c = new Thread3();
		
		Thread d1 = new Thread(a);
		Thread d2 = new Thread(b);
		Thread d3 = new Thread(c);
		
		d1.start();
		d2.start();
		d3.start();
		
	}

}
