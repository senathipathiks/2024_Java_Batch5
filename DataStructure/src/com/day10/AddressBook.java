package com.day10;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {

	
	ArrayList<Contact> list = new ArrayList<>(); 

	public boolean addContact(Contact cont) {
		return list.add(cont);
	}

	public boolean updateContact(Contact cont1) {
		boolean flag = false;
		Iterator<Contact> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().getFirstName() == cont1.getFirstName()) {
				it.remove();
				list.add(cont1);
				flag = true;
				break;
			}
		}
		return flag;
	
	}

	public boolean deleteEmployee(String FirstName) {
		boolean flag = false;
		Iterator<Contact> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().getFirstName() == FirstName) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Contact findEmployee(String firstName) {
		Contact cnt = null;
		for (Contact g : list) {
			if (g.getFirstName() == firstName) {
				cnt = g;
				break;
			}
		}
		return cnt;
	}



	public void viewAllContact() {
		for (Contact g : list) {
			g.display();
		}
		
	}

	public void display() {
		
	}

}