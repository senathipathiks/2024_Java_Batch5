package mypackage;
import java.util.ArrayList;
public class ListArray
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		//Insertion
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		list.add(1,15);
		System.out.println(list);
		
		Integer obj=list.get(1);
		System.out.println(obj);
		
		//Deletion
		
		list.remove(3);
		System.out.println(list);
		
		//Updation
		
		list.set(1, 10);
		System.out.println(list);
		
		//Other methods
		
		System.out.println(list.size());
		System.out.println(list.contains(10));
		System.out.println(list.isEmpty());
		
		//Display Elements
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}
}