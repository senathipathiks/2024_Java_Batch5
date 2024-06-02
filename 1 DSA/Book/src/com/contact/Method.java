package com.contact;

import java.util.HashMap;
import java.util.Set;

public class Method {

	HashMap<String, AddressBook> map = new HashMap<>();
	
	public boolean addContect(AddressBook con) {
		map.put(con.getPhoneNumber(),con);
		return true;
	}
	
	public boolean updateContact(AddressBook con) {
		if(map.containsKey(con.getPhoneNumber())) {
			map.put(con.getPhoneNumber(), con);
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean deleteContact(String phoneNumber) {
		if(map.remove(phoneNumber) != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public AddressBook findContact(String phoneNumber) {
		return map.get(phoneNumber);
	}
	
	public void viewAllContact() {
		Set <String> keys = map.keySet();
		for(String key : keys) {
			map.get(key).display();
		}
	}
}
