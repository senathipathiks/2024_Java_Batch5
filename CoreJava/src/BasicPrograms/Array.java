package BasicPrograms;

public class Array {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		int arr1[]=new int[5];
		
		//System.arraycopy(arr, 0, arr1, 0, 5); // source, copy from 0,destination,store from 0 t0 5 
		
		//arr1=arr;  // both reference are same 
		
		arr1=arr.clone(); // both reference are not same
		
		for(int i:arr1) {
			System.out.println(i);
		}

	}

}
