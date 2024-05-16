package BasicPrograms;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		arr[0]=new int[]{1,2,3};
		arr[1]= new int[]{4,5};
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+"");
			}
			System.out.println("");
		}
				
	}

}
