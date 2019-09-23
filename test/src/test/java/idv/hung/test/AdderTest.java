package idv.hung.test;

import org.junit.Test;

import junit.framework.TestCase;

public class AdderTest extends TestCase {
	@Test
	public void test() {
		assertEquals("3+5 must be equal 8", 8 ,new Adder().add(3,5));
		assertEquals("96+32 must be equal 128", 128 ,new Adder().add(96,32));
	}
}
