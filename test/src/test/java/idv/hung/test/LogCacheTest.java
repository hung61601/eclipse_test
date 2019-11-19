package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogCacheTest {
	
	@Test
	public void testInstance() {
		LogCache log1 = LogCache.getInstance();
		LogCache log2 = LogCache.getInstance();
		assertSame(log1, log2);
	}
	@Test
	public void testGet() {
		LogCache log = LogCache.getInstance();
		assertEquals(String.format(rep(log.getProduced()), "test"), "Produced a \"test\".");
		assertEquals(String.format(rep(log.getBuild()), "test"), "build a \"test\".");
		}
	public String rep(String str) {
		//去除字串中的換行符
		return str.replace("%n","");
	}
}
