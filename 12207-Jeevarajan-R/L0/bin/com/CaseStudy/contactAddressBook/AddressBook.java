package CaseStudy.contactAddressBook;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;



public class AddressBook {
	
	TreeMap<String, Contact> map = new TreeMap<>(Collections.emptySortedMap());
	
	public boolean addContact(Contact ct) {
		map.put(ct.getFirstName()+ct.getLastName(), ct);
		return true;
	}
	
	public boolean updateContact(Contact ct) {
		if(map.containsKey(ct.getFirstName())) {
			map.put(ct.getFirstName()+ct.getLastName(), ct); 
			return true;
		} else return false;
	}
	
	public boolean deleteContact(String name) {
//		String = ;
		if(map.remove(name) != null) {
			return true;
		}else return false;
		
	}
	public Contact findContact(String name) {
		Contact ct = null; 
		if (map.containsKey(name)) {
			ct = map.get(name);			
		}
		return ct;
	}
	public void viewAllContact() {
		Iterator <String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next(); 
			map.get(key).display();
		}		
	}

}
