package com.madhan.restapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.madhan.restapp.model.Shop;

@SpringBootTest
class ShopServiceTest {

	@Autowired
	private ShopService shopService;
	@Test
	@Order(1)
	void testAddShop() {
		Shop obj=new Shop();
		//assertEquals("Success",shopService.addShop());
	}

	@Test
	void testGetShop() {
		fail("Not yet implemented");
	}

	

}
