package Synchronization;

class File
{
	synchronized public void sum(int[] arr){
		int res =0;
		for(int i:arr)
		{
			res+=i;
			System.out.println("Value of i is: "+ i + " Sum is: " +res);
		}
		System.out.println(res);
	}
}

class ThreadA extends Thread
{
	File f=new File();
	int arr[]= {1,2,3,4,5};
	ThreadA(File f)
	{
		this.f=f;
	}
	public void run()
	{
		f.sum(arr);
	}
}

class ThreadB extends Thread
{
	File f=new File();
	int arr[]= {6,7,8,9,10};
	ThreadB(File f)
	{
		this.f=f;
	}
	public void run()
	{
		f.sum(arr);
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File();
		ThreadA th1=new ThreadA(f1);
		ThreadB th2=new ThreadB(f1);
		th1.run();
		th2.run();
	
	}

}
