package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void mergeSort(int[] arr, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
 
	    for (int i = 0; i < mid; i++) {
	        l[i] = arr[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = arr[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);
 
	    merge(arr, l, r, mid, n - mid);
	}
	public static void merge(
			  int[] arr, int[] l, int[] r, int left, int right) {
			
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            arr[k++] = l[i++];
			        }
			        else {
			            arr[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        arr[k++] = l[i++];
			    }
			    while (j < right) {
			        arr[k++] = r[j++];
			    }
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
	    int sz =s.nextInt();
	    int arr[]= new int[sz];
	    for (int i=0;i<sz;i++) {
	    	arr[i]=s.nextInt();
	    }
	    mergeSort(arr, sz);
	    System.out.println(Arrays.toString(arr));
	}
 
}



