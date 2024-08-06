package srienath.Junit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {

	@Test
	void testCompareString() {
		assertEquals(1,App.CompareString("Srienath", "Srienath"));
	}
	
	@Test
	void testCompareString1() {
		assertEquals(0,App.CompareString("Srienath", "Srienath"));
	}

}