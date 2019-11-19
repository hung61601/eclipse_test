package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EnchanterFactoryTest {
	private EnchanterFactory ef;
	private LogCache log;
	
	@Before
	public void setUp() {
		log = LogCache.getInstance();
		Factory.setCache(log);
	}
	@Test
	public void test() {
		// 1.接口功能測試 (接口功能的正確性)
		ef = new EnchanterFactory();
		ef.setName("testName");
		ef.setIntelligence(50);
		Enchanter e = ef.produce();
		assertEquals(e.getName(), "testName");
		assertEquals(e.getInt(), 60);
		// 2.局部數據結構測試 (變量有無初始值)
		ef = new EnchanterFactory();
		e = ef.produce();
		assertEquals(e.getName(), "Swordsman");
		assertEquals(e.getInt(), 0);
		// 3.邊界條件測試 (最小值，最大值)
		ef.setIntelligence(-40);
		e = ef.produce();
		assertEquals(e.getInt(), 0);
	}
}
