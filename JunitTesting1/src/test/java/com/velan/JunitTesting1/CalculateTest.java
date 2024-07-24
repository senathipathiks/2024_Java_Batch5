package com.velan.JunitTesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculateTest {

	private Calculate cal;
	
	@BeforeEach
	public void setUp() {
		cal =new Calculate();
	}
	
	@AfterEach
	public void tearDown() {
		cal =null;
		System.out.println("Test Finished");
	}
	
	@Test 
	void testAdd() {
	  int result =cal.add(2, 3);
	  assertEquals(5,result);
	}
	
	
	@Test 
	void testsub() {
	  int result =cal.sub(5, 3);
	  assertEquals(2,result);
	}
	
	@Disabled("Disabled until bug #123 ids fixed")
	@Test 
	public void testsubNegativeResult() {
	  int result =cal.sub(3, 5);
	  assertEquals(-2,result);
	}
}
