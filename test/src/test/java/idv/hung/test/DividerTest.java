package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DividerTest {

	@Test
	public void test() {
		assertEquals("9/3 must be equal 3", 3 ,new Divider().divide(9, 3)) ;
	}
	
	@Test
	public void test2() {
		assertEquals("12/3 must be equal 4", 3 ,new Divider().divide(12, 3)) ;
	}
	
	
}
