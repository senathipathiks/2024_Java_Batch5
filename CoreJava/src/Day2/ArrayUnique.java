package Day2;

public class ArrayUnique {
	
	public static void main(String[] args) {
		
		int arr[]=new int[] {1,2,3,1,4,5,2,1,1};
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			arr[j]=-1;
	    		}
	    	}
	    	if(arr[i]!=-1) {
	    		System.out.print(arr[i]+" ");
	    	}
	    }	
	}

}
