package com.aravind.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest3 {

	@Test
	void test() {
		assertTrue(App.StringCmpr("aravind", "aravind"));
		
	}
	
	@Test
	void test2() {
		assertFalse(App.StringCmpr("Aravind", "aravind"));
		
	}

}
