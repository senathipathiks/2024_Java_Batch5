package taskArray;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,5,6,7,6,8,9};
		System.out.println("Duplicate elements are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}

}
