package com.aravind.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testCompareString() {
		//fail("Not yet implemented");
		assertEquals(1,App.CompareString("Aravind", "Aravind"));
	}
	
	@Test
	void testCompareString1() {
		assertEquals(0,App.CompareString("Aravind", "ARavind"));
	}

}
