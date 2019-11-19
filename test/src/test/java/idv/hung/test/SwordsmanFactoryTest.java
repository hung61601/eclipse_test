package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SwordsmanFactoryTest {
	private SwordsmanFactory sf;
	private LogCache log;
	
	@Before
	public void setUp() {
		log = LogCache.getInstance();
		Factory.setCache(log);
	}
	@Test
	public void test() {
		// 1.接口功能測試 (接口功能的正確性)
		sf = new SwordsmanFactory();
		sf.setName("testName");
		sf.setStrength(50);
		Swordsman s = sf.produce();
		assertEquals(s.getName(), "testName");
		assertEquals(s.getStr(), 50);
		// 2.局部數據結構測試 (變量有無初始值)
		sf = new SwordsmanFactory();
		s = sf.produce();
		assertEquals(s.getName(), "Swordsman");
		assertEquals(s.getStr(), 0);
		// 3.邊界條件測試 (最小值，最大值)
		sf.setStrength(-50);
		s = sf.produce();
		assertEquals(s.getStr(), 0);
	}
}
