package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArmorBuilderTest {
	private ArmorBuilder ab;
	private LogCache log;
	
	@Before
	public void setUp() {
		log = LogCache.getInstance();
		Builder.setCache(log);
	}
	@Test
	public void test() {
		// 1.接口功能測試 (接口功能的正確性)
		ab = new ArmorBuilder();
		ab.setName("testName");
		ab.setDef(90);
		Armor a1 = ab.build();
		assertEquals(a1.getName(), "testName");
		assertEquals(a1.getDef(), 90);
		ab.setName("testName2");
		ab.setDef(80);
		Armor a2 = ab.build();
		assertEquals(a2.getName(), "testName2");
		assertEquals(a2.getDef(), 80);
		// 3.邊界條件測試 (最小值，最大值)
		ab.setDef(-20);
		Armor a = ab.build();
		assertEquals(a.getDef(), 0);
	}
}
