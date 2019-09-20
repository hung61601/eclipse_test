package idv.hung.test;

import org.junit.Test;

import junit.framework.TestCase;

public class AdderTest extends TestCase {
	@Test
	public void test() {
		assertEquals("3+5 must be equal 8", 8 ,new Adder().add(3,5)) ;
	}
	@Test
	public void test1() {
		assertFalse("6-3 must be equal 3", new Adder().substarct(6,3) == 4) ;
	}
}
