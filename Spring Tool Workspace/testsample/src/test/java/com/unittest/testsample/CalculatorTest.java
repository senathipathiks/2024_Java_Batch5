package com.unittest.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator cal;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cal = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		cal = null;
		System.out.println("Test Finished!!!");
	}

	@Test
	void testAdd() {
		int res = cal.add(4, 5);
		assertEquals(9, res);
	}

	@Test
	void testSub() {
		int res = cal.sub(5, 4);
		assertEquals(1, res);
	}
	
	@Disabled("Disable until bug #123 is fixed")
	@Test
	public void testSubtractNegativeResult() {
		int res = cal.sub(3, 5);
		assertEquals(-2, res);
	}

}
