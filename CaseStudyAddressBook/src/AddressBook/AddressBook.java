package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
	ArrayList<Contact> list = new ArrayList<>();

	public boolean addContact(Contact c1) {
		list.add(c1);
		return true;
	}

	public boolean updateContact(Contact c1) {
		boolean flag = false;
		Iterator<Contact> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().getFirstName().equals(c1.getFirstName())) {
				it.remove();
				list.add(c1);
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean deleteContact(String firstName) {
		boolean flag = false;
		Iterator<Contact> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().getFirstName().equals(firstName)) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;

	}

	public void findContact(String f1) {
		for (Contact i : list) {
			if (i.getFirstName().equals(f1)) {
				i.display();
				break;
			}
		}
	}

	public void viewall() {
		for (Contact i : list) {
			i.display();
		}
	}
}
