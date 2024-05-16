package Book;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Add book");
		System.out.println("Update Book");
		System.out.println("Delete book");
		System.out.println("Display");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		BookManagement b=new BookManagement(); 
		int choice;
		do
		{
//			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter employee Id ,name,salary,dno");
				Book bk = new Book(sc.nextInt(), sc.next(), sc.next(), sc.next());
				if (b.addBook(bk)) {
					System.out.println("Employee object added");
				} else {
					System.out.println("Employee object not added");
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Hello");
				break;
			}
		}while(choice<5);

	}

}
