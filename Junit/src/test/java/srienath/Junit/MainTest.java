package srienath.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	@Test
	void test() {
		assertEquals(6+7+8, Main.sumDigit(678));
	}
	
	@Test
	void test1() {
		assertEquals(22, Main.sumDigit(678));
	}
}