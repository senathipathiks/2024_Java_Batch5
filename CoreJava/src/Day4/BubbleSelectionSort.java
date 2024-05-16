package Day4;

interface sortable{
	void sort(int arr[]);
}
class BubbleSort implements sortable{
	
	public void sort(int arr[]) {
		System.out.print("Bubble Sort :");
		for (int i = 0; i < arr.length; i++)  
        {  
            for (int j = i + 1; j < arr.length; j++)  
            {  
                if (arr[j] < arr[i])  
                {  
                   int temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
            System.out.print(arr[i]+" ");
        }
		
	}
}

class SelectionSort implements sortable{
	
	public void sort(int arr[]) {
		System.out.print("\nSelection Sort :");
		int small=0;
		 for (int i = 0; i < arr.length; i++)   
		    {  
		        small = i;   
		        for (int j = i+1; j < arr.length; j++)  
		        if (arr[j] < arr[small])  
		            small = j;  
		
		    int temp = arr[small];  
		    arr[small] = arr[i];  
		    arr[i] = temp;  
		    System.out.print(arr[i]+" ");
		    } 
		}  
}
public class BubbleSelectionSort {

	public static void main(String[] args) {
		int arr[]=new int[] {9,8,7,5,3,4,6};
		BubbleSort bs=new BubbleSort();
		bs.sort(arr);
		SelectionSort ss=new SelectionSort();
		ss.sort(arr);
	}

}
