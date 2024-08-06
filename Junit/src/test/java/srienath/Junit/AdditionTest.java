package srienath.Junit;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {
	@Test
	void test() {
		Addition add = new Addition();
		assertEquals(8, add.sum(3, 5));
	}
}
