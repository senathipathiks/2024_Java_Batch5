package srienath.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest3 {

	@Test
	void test() {
		assertTrue(App.StringCmpr("srienath", "srienath"));
		
	}
	
	@Test
	void test2() {
		assertFalse(App.StringCmpr("Srienath", "srienath"));
		
	}

}
