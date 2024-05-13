package com.day1;
import java.util.HashMap;
import java.util.Set;

public class CustomerManagement {

	HashMap<Integer,Customer> map = new HashMap<>();
	
	public boolean addCustomer(Customer cust) {
		map.put(cust.getCustomer_Id(), cust);
		return true;
	}
	
	public Customer findCustomer(int id) {
		return map.get(id);
	}
	
	public boolean updateCustomer(int i,Customer cmt1) {
		
		 if (map.containsKey(i))
		 {
			 map.put(i,cmt1);
		 }
		
		map.put(i, cmt1);
		return true;
	}
	
	public boolean deleteCustomer(int id) {
		if(map.remove(id)!=null){
		return true;
		}
		else {
		return false;
		}
	}
	
	public void viewallCustomer() {
		Set<Integer> keys = map.keySet();
		for(Integer key:keys) {
			map.get(key).display();
		}
	}
	

}
