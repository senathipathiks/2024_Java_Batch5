package addressBook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
	ArrayList<Contact> list = new ArrayList<>();

	public boolean addContact(Contact emp) {
		return list.add(emp);
	}

	public boolean UpdateContact(Contact emp) {
		boolean flag = false;
		Iterator<Contact> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().getEname() == emp.getEname()) {
				it.remove();
				list.add(emp);
				flag = true;
				break;
			}
		}

		return flag;
	}

	public boolean deleteContact(String fname) {

//		Employee emp = null;
//		int index = 0;
//		for(Employee e : list)
//		{
//			if (e.getEid() == id) {
//				list.remove(index);
//				break;
//			} 
//			index++;
//		}
//		return emp;
		boolean flag = false;
		Iterator<Contact> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().getFname() == fname) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Contact findContact(String fname) {
		Contact emp = null;
		for (Contact e : list) {
			if (e.getFname() == fname) {
				emp = e;
				break;
			}
		}
		return emp;
	}

	public void viewAllContact() {
		for (Contact e : list) {
			e.display();
		}

	}

}
