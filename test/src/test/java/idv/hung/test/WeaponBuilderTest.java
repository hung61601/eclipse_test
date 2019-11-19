package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeaponBuilderTest {
	private WeaponBuilder wb;
	private LogCache log;
	
	@Before
	public void setUp() {
		log = LogCache.getInstance();
		Builder.setCache(log);
	}
	@Test
	public void test() {
		// 1.接口功能測試 (接口功能的正確性)
		wb = new WeaponBuilder();
		wb.setName("testName");
		wb.setAtk(35);
		Weapon w1 = wb.build();
		assertEquals(w1.getName(), "testName");
		assertEquals(w1.getAtk(), 35);
		wb.setName("testName2");
		wb.setAtk(70);
		Weapon w2 = wb.build();
		assertEquals(w2.getName(), "testName2");
		assertEquals(w2.getAtk(), 70);
		// 3.邊界條件測試 (最小值，最大值)
		wb.setAtk(-20);
		Weapon w = wb.build();
		assertEquals(w.getAtk(), 0);
	}
}
