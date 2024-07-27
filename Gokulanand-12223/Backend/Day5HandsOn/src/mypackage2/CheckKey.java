package mypackage2;
import java.util.HashMap;
import java.util.*;
public class CheckKey
{
	public static void main(String[] args)
	{
		int key;
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1,"Apple");
		hmap.put(2,"Banana");
		hmap.put(3,"Orange");
		hmap.put(4,"Melons");
		
		System.out.println("Enter the key that if it is present or not ?");
		key = sc.nextInt();
		
		int count=0;
		Set<Integer> set = hmap.keySet();
		for(Integer i : set)
		{
			if(key==i)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("Yes !!! There is Present !!!");
		}
		else
		{
			System.out.println("No !!! There is Not Present !!!");
		}
		}	
	}


