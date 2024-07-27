package testing.juniteg4;

import junit.framework.TestCase;

public class AppTestCase extends TestCase {

	public void testCompare() 
	{
		assertTrue(App.compare(678));
	}

}
