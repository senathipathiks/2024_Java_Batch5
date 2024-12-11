package day7;
class Thread1 extends Thread{
	
	public void run() {
		int cnt=1;
		for(int i=0;i<20;i++) {
			System.out.println("Thread 1 -"+cnt);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			cnt++;
		}
	}
}
class Thread2 extends Thread{
	
	public void run() {
		int cnt=1;
		for(int i=0;i<20;i++) {
			System.out.println("Thread 3 -"+cnt);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			cnt++;
		}
	}
}

class Thread3 extends Thread{
	
	public void run() {
		int cnt=1;
		for(int i=0;i<20;i++) {
			System.out.println("Thread 2 -"+cnt);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			cnt++;
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread1 th1 = new Thread1();
       Thread2 th2  = new Thread2();
       Thread3 th3= new Thread3();
      
       th1.setPriority(9);
       th2.setPriority(6);
       th3.setPriority(3);
       
       System.out.println(th2.getPriority());
       System.out.println(th1.getPriority());
       System.out.println(th3.getPriority());

       th1.start();
       th2.start();
       th3.start();
	}

}
