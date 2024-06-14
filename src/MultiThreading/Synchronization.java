package MultiThreading;

class File{
	synchronized public void sum(int[] arr) {
		int r=0;
		for(int i:arr) {
			r+=i;
			System.out.println("Sum is:"+r);
		}
		System.out.println(r);
	}
}
class Thread1 extends Thread{
	File f=new File();
	int arr[]= {1,2,3};
	Thread1(File f){
		this.f=f;
	}
	public void run() {
		f.sum(arr);
	}
}
class Thread2 extends Thread{
	File f=new File();
	int arr[]= {4,5,6};
	Thread2(File f){
		this.f=f;
	}
	public void run() {
		f.sum(arr);
	}
}

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f1=new File();
Thread1 t1=new Thread1(f1);
Thread2 t2=new Thread2(f1);
t1.run();
t2.run();

	}

}
