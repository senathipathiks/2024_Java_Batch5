package Multithreading;

class File{
	synchronized void print() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
class Thread1 extends Thread{
	File f=new File();
	Thread1(File f){
		this.f=f;
	}
	public void run() {
		f.print();
	}
}
class Thread2 extends Thread{
	File f=new File();
	Thread2(File f){
		this.f=f;
	}
	public void run() {
		f.print();
	}
}

public class SynchronizationEg  {

	public static void main(String[] args) {
		File f=new File();
		Thread1 th1=new Thread1(f);
		Thread2 th2=new Thread2(f);	
		th1.start();
		th2.start();

		}

}


