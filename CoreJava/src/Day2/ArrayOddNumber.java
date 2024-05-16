package Day2;

public class ArrayOddNumber {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,9,8,7,6,5};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2!=0) {
	            count+=1;	
				System.out.print(arr[i]+" ");				
		     }
     	}
		System.out.print("\nCount :"+count);
	}

}
