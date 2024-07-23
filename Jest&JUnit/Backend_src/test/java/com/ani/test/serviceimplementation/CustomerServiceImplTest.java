package com.ani.test.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ani.test.model.Customer;
import com.ani.test.model.Movie;

@SpringBootTest
class CustomerServiceImplTest {
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@Test
	void testAddCustomer() {
		Movie objMovie = new Movie(110,"mahe","horror","4pm-6pm");
		Customer objStudent = new Customer(110,"ANI","65","23/10",objMovie);
		assertEquals("success",customerServiceImpl.addCustomer(objStudent) );
	}
	@Test
	void testAddCustomer2() {
		Movie objMovie = new Movie();
		Customer objStudent = new Customer(110,"ANI","65","23/10",objMovie);
		assertEquals("success",customerServiceImpl.addCustomer(objStudent) );
	}

	@Test
	void testGetCustomer() {
		assertNotNull(customerServiceImpl.getCustomer(2));
	}
	@Test
	void testGetCustomer2() {
		int id=611;
		assertEquals(null,customerServiceImpl.getCustomer(id) );
	}
	@Test
	void testGetCustomer3() {
		int id=15;
		assertNotNull(id);
	}
	@Test
	void testGetAllCustomers() {
		assertNotNull(customerServiceImpl.getAllCustomers());
	}

	@Test
	void testUpdateCustomer() {
		Customer c2 = new Customer(110,"ANI","65","forest street",null);
		assertEquals("success", customerServiceImpl.updateCustomer(c2));
	}
	@Test
	void testUpdateCustomer2() {
		Customer c2 = new Customer();
		assertEquals("success", customerServiceImpl.updateCustomer(c2));
	}
	@Test
	void testUpdateCustomer3() {
		Customer c2 = null;
		assertEquals("failure", customerServiceImpl.updateCustomer(c2));
	}
	@Test
	void testDeleteCustomer() {
		assertEquals("failure",  customerServiceImpl.deleteCustomer(1));
	}
	@Test
	void testDeleteCustomer1() {
		assertEquals("success",  customerServiceImpl.deleteCustomer(19));
	}

}
