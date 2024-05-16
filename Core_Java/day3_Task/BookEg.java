package com.day3_Task;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String title, author, ISBN;
    
    ArrayList<String> it = new ArrayList<>();
    

    Scanner s = new Scanner(System.in);
    void add_Book() {
        System.out.println("Enter the title name to add: ");
        String str = s.next();
        it.add(str);
        System.out.println("Enter the Author name to add: ");
        String str1 = s.next();
        it.add(str1);
        System.out.println("Enter the ISBN to add: ");
        String str2 = s.next();
        it.add(str2);
        System.out.println("Book name gets added");
    }
    void del_Book(String title) {
        for(int i=0;i<it.size();i++) {
            if(it.get(i).equalsIgnoreCase(title)) {
                it.remove(i);
                System.out.println("Removed");
            }
        }
        
    }
    
    Boolean search(String d) {
        String ans="";
        for(int i=0;i<it.size();i++) {
            if(it.get(i).equalsIgnoreCase(d)) {
        ans = it.get(i);
            }
        }
        return true;
    }
    
    void display() {
        System.out.println("Book Name : "+it);
    }

}

public class BookEg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        String msg=" ";
        do {
            System.out.println("1.Add Book");
            System.out.println("2.Remove Book ");
            System.out.println("3.Search Book");
            System.out.println("4.Display");
            System.out.println("5.Quit");
            
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    b.add_Book();
                break;
                case 2:
                    System.out.println("Enter the title to delete:");
                    String del = sc.next();
                    b.del_Book(del);
                    break; 
                case 3:
                    System.out.println("Enter the title to display:");
                    String d = sc.next();
                    if(b.search(d)) {
                        System.out.println("title Found");
                    }
                    break;
                case 4:
                    b.display();
                    break;
                case 5:
                    System.exit(0);
            
            }
            System.out.println("Do yot want to continue [Yes|No]");
            msg = sc.next();
        }
        while(msg.equalsIgnoreCase("yes"));
    sc.close();
    }

}
