package arrays;
import java.util.*;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] arr=new int[] {1,2,3,4,5};
Scanner s=new Scanner(System.in);		
int[] arr=new int[4];
int[] arr1=new int[4];
//System.out.println(arr[0]);
//System.out.println(arr.length);
for(int i=0;i<4;i++) {
	arr[i]=s.nextInt();
}
for(int i:arr) {
	System.out.println(i);
}
System.out.println("--------------------------");
System.arraycopy(arr, 0, arr1, 0, 1);
//arr1=arr;
//arr1=arr.clone();
for(int i:arr1) {
	System.out.println(i);
}
arr1=arr.clone();
if(arr1==arr) {
	System.out.println("true");
}
else {
	System.out.println("false");
}
	}

}
