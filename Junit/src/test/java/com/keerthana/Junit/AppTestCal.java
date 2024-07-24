package com.keerthana.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTestCal {

	private Calculator cal;

	@BeforeEach
	public void setUp() {
		cal=new Calculator();
	}

	@AfterEach
	public void tearDown() {
		cal = null;
		System.out.println("Test Finished");
	}

	@Test
	void testAdd() {
		int res = cal.add(1, 1);
		assertEquals(2, res);
	}

	@Test
	void testSub() {
		int res = cal.subtract(4, 1);
		assertEquals(3, res);
	}

}
