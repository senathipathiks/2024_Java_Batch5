package com.emp;

import java.util.HashMap;
import java.util.Set;

public class ProductManagement {
	
	HashMap< Integer, Product> map = new HashMap<>();
	
	boolean addProduct (Product p) {
		map.put(p.getProductId(), p);
		return true;
		}

	Product findProduct (int productiId) {
		map.get(productiId);
		return map.get(productiId);
		}
	
	public boolean updateProduct(Product p) {
		if(map.containsKey(p.getProductId())){
			map.put(p.getProductId(), p);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean deleteProduct(int productId) {
		if(map.containsKey(productId)){
			map.remove(productId);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void viewAll() {
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			map.get(key).display();
		}
	}
}
