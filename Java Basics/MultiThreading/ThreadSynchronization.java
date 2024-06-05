package MultiThreading;

class File {
	synchronized public void print() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class ThreadA1 extends Thread {
	File f = new File();

	ThreadA1(File f) {
		this.f = f;      
	}

	public void run() {
		f.print();
	}
}

class ThreadB1 extends Thread {
	File f = new File();

	ThreadB1(File f) {
		this.f = f;
	}

	public void run() {
		f.print();
	}
}

public class ThreadSynchronization {

	public static void main(String[] args) {
		File f = new File();
		ThreadA1 A1 = new ThreadA1(f);
		ThreadB1 B1 = new ThreadB1(f);
		
		A1.start();
		B1.start();
		
	}

}
