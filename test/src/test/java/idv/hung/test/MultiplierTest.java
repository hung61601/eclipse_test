package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplierTest {
	@Test
	public void test() {
		assertEquals(6, new Multiplier().multiplier(3, 2));
		// int乘法運算
		assertEquals(new IntegerOprand(-6).content,
				new Multiplier().multiply(new IntegerOprand(3), new IntegerOprand(-2)).content);
		// float乘法運算
				assertEquals(new FloatOprand((float)7.6800003).content,
						new Multiplier().multiply(new FloatOprand((float)3.2), new FloatOprand((float)2.4)).content);
	}

}
