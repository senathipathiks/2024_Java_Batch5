package testing.juniteg1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTestCase {

	@Test
	void testCompareString() 
	{
		assertEquals(1,App.compareString("gokul", "gokul"));
	}

	@Test
	void testCompareString1()
	{
		assertEquals(0,App.compareString("GOKUL", "gokul"));
	}
}
