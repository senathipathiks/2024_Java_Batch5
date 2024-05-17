package day2;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
	    int sz =s.nextInt();
	    int arr[]= new int[sz];
	    for (int i=0;i<sz;i++) {
	    	arr[i]=s.nextInt();
	    }
	    
	    for(int i=0 ;i<sz;i++) {
	    	int cnt=0;
	       Boolean 	flag = true;
	    	for(int j=i+1;j<sz;j++) {
	    		if(arr[j]==arr[i] && arr[j]!=-1 && arr[i]!=-1) {
	    			cnt++;
	    			arr[j]=-1;
	    			flag=false;
	    		}
	    	}
	    	
	    	if(cnt>=1) {
	    		System.out.println("duplicate");
	    		System.out.println(arr[i]);
	    		
	    	}
	    	
	    	if(flag==true && arr[i]!=-1) {
	    		System.out.println("unique ele");
	    		System.out.println(arr[i]);
	    	}
	    }
	}

}
