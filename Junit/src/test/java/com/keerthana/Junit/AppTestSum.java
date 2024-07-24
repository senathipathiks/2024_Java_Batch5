package com.keerthana.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTestSum {

//	@Test
//	void testSum() {
//		int a[]= {1,2,3};
//		assertEquals(6,App.sum(a));
//	}
	
	@Test
	void testSum() {
	    int a[] = {1, 2, 3};
	    assertNotNull(App.sum(a));
	}

}
                                                                            
