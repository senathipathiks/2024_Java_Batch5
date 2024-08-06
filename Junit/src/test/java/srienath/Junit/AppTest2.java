package srienath.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest2 {

	@Test
	void testSum() {
		int a[] = {1,2,3,4};
		assertEquals(10,App.sum(a));
	}
	
	@Test
	void testSum1() {
		int a[] = {1,2,3,4};
		assertEquals(9,App.sum(a));
	}

}
