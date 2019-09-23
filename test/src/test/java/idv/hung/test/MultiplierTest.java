package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplierTest {

	@Test
	public void test() {
		assertEquals(6, new Multiplier().multiplier(3, 2));
		assertEquals(-6, new Multiplier().multiplier(3, -2));
	}

}
