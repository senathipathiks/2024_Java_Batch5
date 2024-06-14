package taskArray;
import java.util.*;

public class Desending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,6,7,3,8,45};
		sortDescending(arr);
		
		System.out.println("Sorted:");
		for(int num:arr) {
			System.out.println(num+" ");
		}

	}
	public static void sortDescending(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] < arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
