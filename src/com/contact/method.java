package com.contact;

import java.util.HashMap;
import java.util.Set;

public class method {

		HashMap<Double,addressBook> map = new HashMap<>();
		
		public boolean addContact(addressBook con) {
			map.put(con.getMobNo(), con);
			return true;
		}
		
		public boolean updateContact(addressBook con) {
			if(map.containsKey(con.getMobNo())) {
				map.put(con.getMobNo(), con);
				return true;
			} else {
				return false;
			}
		}
		
		public boolean deleteContact(int mobNo) {
			if(map.remove(mobNo)!=null)
				return true;
			else 
				return false;
		}
		
		public addressBook findContact(int mobNo) {
			return map.get(mobNo);
		}
		
		public void viewAllContact() {
			Set<Double> keys = map.keySet();
			for (Double key : keys)
				map.get(key).display();
		}
}
