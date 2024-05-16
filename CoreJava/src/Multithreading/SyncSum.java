package Multithreading;

class File1{
	 synchronized void sum(int arr[]) {
		int res=0;
		for(int i:arr) {
			res+=i;
			System.out.println("Value of i is:"+i+" Sum is :"+res);
		}
		System.out.println(res);
	}
}

class Thread_A extends Thread{
	File1 f=new File1();
	int arr[]= {1,2,3,4,5};
	Thread_A(File1 f){
		this.f=f;
	}
	public void run() {
		f.sum(arr);
	}
}
class Thread_B extends Thread{
	File1 f=new File1();
	int arr[]= {6,7,8,9,10};
	Thread_B(File1 f){
		this.f=f;
	}
	public void run() {
		f.sum(arr);
	}
}
public class SyncSum {

	public static void main(String[] args) {
		File1 f=new File1();
		Thread_A th1=new Thread_A(f);
		Thread_B th2=new Thread_B(f);	
		th1.start();
		th2.start();

	}

}
