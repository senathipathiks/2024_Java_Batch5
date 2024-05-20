package day7;


class ThreadA extends Thread{
	
	int count = 0;
	
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Thread A - "+i);
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		System.out.println("Total Thread Count: "+count);
	}
}

class ThreadB extends Thread{
	
	int count = 0;
	
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Thread B - "+i);
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		System.out.println("Total Thread Count: "+count);
	}
}

class ThreadC extends Thread{
	
	int count = 0;
	
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Thread C - " + i);
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		System.out.println("Total Thread Count: "+count);
	}
}




public class Threads {

	public static void main(String[] args) {

		ThreadA th1 = new ThreadA();
		ThreadB th2 = new ThreadB();
		ThreadC th3 = new ThreadC();
		
		th1.setPriority(9);
		th2.setPriority(6);
		th3.setPriority(3);
		
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
