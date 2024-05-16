package Day2;

public class ArrayPrimeNo {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=2;j<=arr[i]/2;j++)
			 if(arr[i]%j==0) {
				arr[i]=-1;
			}
			if(arr[i]!=-1 && arr[i]!=1) {
				count+=1;
				System.out.print(arr[i]+" ");
			}
		}

	}

}
