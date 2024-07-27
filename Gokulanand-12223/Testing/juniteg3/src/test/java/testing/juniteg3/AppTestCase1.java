package testing.juniteg3;

import junit.framework.TestCase;

public class AppTestCase1 extends TestCase {

	public void testMax() {
		assertEquals(8, App.max(678));
	}

}
