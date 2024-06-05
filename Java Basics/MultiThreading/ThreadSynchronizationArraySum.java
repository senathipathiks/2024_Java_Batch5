package MultiThreading;

class File1 {
	synchronized public void sum(int a[]) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			res = res+a[i];
			System.out.println("Value of i : "+i+" Sum is : "+res);
		}
		System.out.println("--------------------------");
	}
}

class ThreadA11 extends Thread {
	int a[]= {1,2,3,4,5};
	File1 f = new File1();
	
	ThreadA11(File1 f) {
		this.f = f;      
	}

	public void run() {
		f.sum(a);
	}
}

class ThreadB11 extends Thread {
	int a[]= {6,7,8,9,10};
	File1 f = new File1();

	ThreadB11(File1 f) {
		this.f = f;
	}

	public void run() {
		f.sum(a);
	}
}

public class ThreadSynchronizationArraySum {

	public static void main(String[] args) {
		File1 f = new File1();
		
		ThreadA11 A11 = new ThreadA11(f);
		ThreadB11 B11 = new ThreadB11(f);
		
		A11.start();
		B11.start();

	}

}
