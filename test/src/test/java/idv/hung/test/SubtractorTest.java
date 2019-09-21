package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractorTest {

	@Test
	public void test1() {
		assertTrue("6-3 must be equal 3", new Subtractor().substarct(6,3) == 3);
	}

}
