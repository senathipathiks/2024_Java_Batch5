package day7;


class File{
	int[] arr;
	int res = 0;
	File(int[] arr){
		this.arr = arr;		
	}
	
	void returnArr() {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	synchronized public void sum() {
		for(int i = 0;i < arr.length;i++) {
			res = res + arr[i];
			System.out.println("result is = "+res+" "+arr[i]);
			arr[i] = res;
		}
		returnArr();
		System.out.println("result is = "+res);
	}
}
 
class Thread11 extends Thread{
	
	File f;
	public Thread11(File f){
		this.f = f;
		
	}
	
	public void run() {
		f.sum();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
 
 
class Thread22 extends Thread{
	File f;
	public Thread22(File f){
		this.f = f;		
	}
	
	public void run() {
		f.sum();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}					
	}
	
}
 
public class SychroThreadDemo {
 
	public static void main(String[] args) {
		int[] ar = new int[]{1,2,3,4};
		// TODO Auto-generated method stub
		File f = new File(ar);
		Thread11 t1 = new Thread11(f);
		Thread22 t2 = new Thread22(f);
		
		t1.start();
		t2.start();
 
	}
 
}
