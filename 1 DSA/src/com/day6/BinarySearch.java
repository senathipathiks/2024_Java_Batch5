package com.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	static int binarySearch(int array[], int x, int start, int end) 
	  {
	    while (start <= end) 
	    {
	      int mid = start + (end - start) / 2;

	      if (array[mid] == x)
	        return mid;

	      if (array[mid] < x)
	        start = mid + 1;

	      else
	        end = mid - 1;
	    }
	    return -1;
	  }
	
	public static void main(String[] args) {
	    int x = 3;
	    
	    
	    List<Integer> al = new ArrayList<Integer>();	
	   
	    al.add(1);
	    al.add(2);
	    al.add(3);
	    al.add(4);
	    al.add(5);
	    
	    int result = Collections.binarySearch(al, x);
	    
	    if (result == -1) {
	    	System.out.println("Element Not found in the Array");
	    } else {
	    	System.out.println("Element found at index " + result);
	    }
	}

}
