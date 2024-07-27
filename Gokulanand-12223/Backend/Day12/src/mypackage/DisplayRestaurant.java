package mypackage;
import java.util.*;
class Restaurant
{
	int n;
	LinkedList<String> itemlist = new LinkedList<>();
	LinkedList<Integer> pricelist = new LinkedList<>();
	LinkedList<Integer> ratinglist = new LinkedList<>();

	void additem()
	{
		String item ;
		int price, rating;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements to be added :");
		n = sc.nextInt();
		for(int i=0; i<n ;i++)
		{
		System.out.println("Enter the item name : ");
		item = sc.next();
		itemlist.add(item);
		System.out.println("Enter the price of the item :");
		price = sc.nextInt();
		pricelist.add(price);
		System.out.println("Enter the rating of the item : ");
		rating = sc.nextInt();
		ratinglist.add(rating);
		}
	}
	void display()
	{
		for(int i=0; i<n; i++)
		{
		System.out.println("Item name is : "+itemlist.get(i));
		System.out.println("Item price is : "+pricelist.get(i));
		System.out.println("Item rating is : "+ratinglist.get(i));
		System.out.println("----------------------------");
		}
	}
	void remove()
	{
		String item;
		System.out.println("Enter the item to be removed : ");
		Scanner sc = new Scanner(System.in);
		item = sc.next();
		itemlist.remove(item);
		System.out.println("Item removed Successfully !!!");
		System.out.println("Balance items are : ");
		for(int i=0; i<n-1; i++)
		{
		System.out.println(itemlist.get(i));
		System.out.println("Item price is : "+pricelist.get(i));
		System.out.println("Item rating is : "+ratinglist.get(i));
		}
	}
}
public class DisplayRestaurant
{
	public static void main(String[] args)
	{
		Restaurant obj = new Restaurant();
		obj.additem();
		obj.display();
		obj.remove();
	}

}
